package hu.noherczeg.necora.web;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Reszletes uzenetet tovabbito, hordozo objektum.
 * 
 * Arra szolgal, hogy a felhasznalok reszere szukseg eseten reszletes, pontos, konnyen
 * feldolgozhato pl. hibainformaciot lehessen kozolni.
 * 
 * Annotacioval le van szabalyozva, tehat gyakorlatilag felhasznalhato barhol, ha pl
 * errorCode nincs megadva, nem lesz serializalva sem. Igy pl. nem felrevezeto az API-t
 * felhasznalok szamara sem.
 * 
 * @author Herczeg Norbert
 *
 */
@JsonInclude(Include.NON_NULL)
public class DetailedMessageDTO {

	/** HTTP Status Code */
	private int statusCode;
	
	/** Rovid tenyszeru uzenet szoveg */
	private String message;
	
	/** 
	 * Amennyiben a rendszerben van hibakod kezeles (belsos), akkor azt ide lehet megadni.
	 * Pl. ez alapjan tud ugyfel hivatkozni a tenyleges hibara
	 */
	private String errorCode;
	
	/**
	 * Amennyiben kell/lehet reszletes leirast is kuldeni a valaszban, azt ebbe kell tenni.
	 * Tipikusan hiba eseten egy linket is szokott tartalmazni ami a hibalista oldalra
	 * mutat az adott siteon.
	 */
	private String description;
	
	public DetailedMessageDTO(int statusCode, String message, String errorCode, String description) {
		super();
		this.statusCode = statusCode;
		this.message = message;
		this.errorCode = errorCode;
		this.description = description;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public String getMessage() {
		return message;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public String getDescription() {
		return description;
	}
	
}
