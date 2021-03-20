package com.vektorel.odev_03;

public class denizHayvanlari extends hayvanlar{
	
	private int dHayvanSayisi;
	
	denizHayvanlari() 
	{
		super();
		System.out.println("Deniz hayvanlari sinifina hosgeldiniz.");
	}
	
	public int getdHayvanSayisi() {
		return dHayvanSayisi;
	}

	public void setdHayvanSayisi(int dHayvanSayisi) {
		this.dHayvanSayisi = dHayvanSayisi;
	}

}
