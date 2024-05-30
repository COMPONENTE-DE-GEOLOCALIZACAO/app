package tui;

import java.util.Scanner;

import enums.LocationEnum;
import geolocate.config.LocationConfiguration;
import geolocate.entities.PresentLocation;

public class LocationTUI {
	private static final String SAIDA = "saindo...";
	private static Scanner scanner = new Scanner(System.in);
	public static PresentLocation location = LocationConfiguration.getLocation();
	
	public static void executar() {
		LocationEnum opcao;
		do {
			exibirMenu();
			opcao = selecionarOpcao();
			executarOpcao(opcao);
		}while(!opcao.equals(LocationEnum.SAIR));
	}
	
	private static void exibirMenu() {
		System.out.println("-------------------------------");
		for(LocationEnum opcao : LocationEnum.values()) {
			System.out.println(opcao.obterDescricaoCompleta());
			
		}
		System.out.println("-------------------------------");
	}
	
	private static LocationEnum selecionarOpcao() {
		LocationEnum opcaoSelecionada;
		int opcaoSelecionadaInt;
		System.out.println("\nDigite o numero da sua escolha:");
		opcaoSelecionadaInt = scanner.nextInt();
		scanner.nextLine();
		opcaoSelecionada = LocationEnum.valueOfCodigo(opcaoSelecionadaInt);
		return opcaoSelecionada;
		
	}
	
	
	private static void executarOpcao(LocationEnum opcao) {
		switch (opcao) {
		case EXIBIR_LOCALIZAÇÃO_COMPLETA: 
			exibirLocalizacaoCompleta();
			break;
		case EXBIR_CIDADE:
			exibirCidade();
			break;
		case EXIBIR_ESTADO:
			exibirEstado();
			break;
		case EXIBIR_PAÍS:
			exibirPais();
			break;
		case EXIBIR_COORDENADAS_APROXIMADAS:
			exibirCoordenadas();
			break;
		case SAIR:
			System.out.println(SAIDA);
		default:
			break;
		}

	}

	private static void exibirLocalizacaoCompleta() {
		System.out.println("Sua Localização Completa é: " + location.getCityName() + ", " + location.getState() + ", " + location.getCountryName() + " / Latitude e Longitude: " + location.getLatitude()+ "," + location.getLongitude());
		
	}
	
	private static void exibirCidade() {
		System.out.println("Sua cidade é: " + location.getCityName());
		
	}
	
	private static void exibirEstado() {
		System.out.println("Seu estado é: " + location.getState());
		
	}
	
	private static void exibirPais() {
		System.out.println("Seu estado é: " + location.getCountryName());
		
	}
	
	private static void exibirCoordenadas() {
		Double latitude = location.getLatitude();
		Double longitude = location.getLongitude();
		System.out.println("Suas coordenadas aproximadas são: " + latitude + ", " + longitude);
	}
	
}
	

