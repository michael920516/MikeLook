package com.example.mikelook.data;

public interface ContactsDAO {

	public void add(Contacts contact);
	public void delete(int ID);
	public void edit(Contacts contact);
	public Contacts[] getAll();
	public Contacts[] search(String keyword);
	public Contacts[] getContacts();
	
}
