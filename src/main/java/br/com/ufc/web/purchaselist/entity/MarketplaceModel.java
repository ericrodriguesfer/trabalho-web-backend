package br.com.ufc.web.purchaselist.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;

import com.sun.istack.NotNull;

@Entity
public class MarketplaceModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotBlank(message = "Name needed of repassed")
	private String name;

	@NotBlank(message = "Quantity products needed of repassed")
	private long quantityProducts;

	@NotNull
	@ManyToOne
	private UserModel user;

	@NotNull
	@OneToOne
	private AdressModel adress;

	@Deprecated
	public MarketplaceModel() {
		super();
	}

	public MarketplaceModel(@NotBlank(message = "Name needed of repassed") String name, UserModel user, AdressModel adress) {
		super();
		this.name = name;
		this.quantityProducts = 0;
		this.user = user;
		this.adress = adress;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public long getQuantityProducts() {
		return quantityProducts;
	}

	public UserModel getUser() {
		return user;
	}

	public AdressModel getAdress() {
		return adress;
	}

	@Override
	public String toString() {
		return "Marketplace [id=" + id + ", name=" + name + ", quantityProducts=" + quantityProducts + ", user=" + user
				+ ", adress=" + adress + "]";
	}

}