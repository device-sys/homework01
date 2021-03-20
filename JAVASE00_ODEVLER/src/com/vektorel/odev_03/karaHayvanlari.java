package com.vektorel.odev_03;

public class karaHayvanlari extends hayvanlar{
	
	private int kHayvanSayisi;
	
	karaHayvanlari() 
	{
		System.out.println("Kara hayvanlari sinifina hosgeldiniz.");
	}
	
	public int getkHayvanSayisi() {
		return kHayvanSayisi;
	}

	public void setkHayvanSayisi(int kHayvanSayisi) {
		this.kHayvanSayisi = kHayvanSayisi;
	}

}
