package br.contatos.gerenciador;

public class ContactList {
	private Node head; 

    // Adiciona um novo contato ao final da lista
    public void addContact(Contact contact) {
        Node newNode = new Node(contact);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Contato adicionado com sucesso!");
    }

    // Busca um contato pelo nome ou número de telefone (verificando se é String)
    public Contact searchContact(String nameOrPhone) {
        Node temp = head;
        while (temp != null) {
            String contactName = temp.contact.getName();
            String contactPhone = temp.contact.getPhoneNumber();

            
            if ((contactName != null && contactName.equalsIgnoreCase(nameOrPhone)) ||
                (contactPhone != null && contactPhone.equals(nameOrPhone))) {
                return temp.contact;
            }
            temp = temp.next;
        }
        return null; // Contato não encontrado
    }

    // Remove um contato pelo nome ou número de telefone (verificando se é String)
    public boolean removeContact(String nameOrPhone) {
        if (head == null) {
            return false;
        }

        String contactName = head.contact.getName();
        String contactPhone = head.contact.getPhoneNumber();

        
        if ((contactName != null && contactName.equalsIgnoreCase(nameOrPhone)) || 
            (contactPhone != null && contactPhone.equals(nameOrPhone))) {
            head = head.next;
            return true;
        }

        Node temp = head;
        while (temp.next != null) {
            contactName = temp.next.contact.getName();
            contactPhone = temp.next.contact.getPhoneNumber();

            
            if ((contactName != null && contactName.equalsIgnoreCase(nameOrPhone)) || 
                (contactPhone != null && contactPhone.equals(nameOrPhone))) {
                temp.next = temp.next.next;
                return true;
            }
            temp = temp.next;
        }
        return false; // Contato não encontrado
    }

    // Exibe todos os contatos armazenados na lista
    public void listContacts() {
        if (head == null) {
            System.out.println("Nenhum contato armazenado.");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.println(temp.contact);
            temp = temp.next;
        }
    }
}
