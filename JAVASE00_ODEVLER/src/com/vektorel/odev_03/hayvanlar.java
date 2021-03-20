package com.vektorel.odev_03;

public class hayvanlar {
	
	public int hayvanSayisi;
	
	hayvanlar()
	{
		System.out.println("Hayvanlar sinifina hosgeldiniz.");
	}
	
	hayvanlar(int hyv)
	{
		System.out.println(hyv+" sayisinda hayvan vardýr.");
	}
	

	public static void main(String[] args) {
		
		denizHayvanlari dhy = new denizHayvanlari();
		dhy.setdHayvanSayisi(100);
		System.out.println(dhy.getdHayvanSayisi()+" tane deniz hayvani mevcuttur.");
		
		karaHayvanlari khy = new karaHayvanlari();
		khy.setkHayvanSayisi(150);
		System.out.println(khy.getkHayvanSayisi()+" tane kara hayvani mevcuttur.");
		

	}

}
