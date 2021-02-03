package com.tetras;

public class PizzaBuilder {

    private boolean emmental = false;

    private boolean cremeFraiche = false;

    private boolean lardons = false;

    private boolean sauceTomate = false;

    private boolean anchois = false;

    private boolean champignons = false;

    private boolean jambon = false;

    public PizzaBuilder addJambon() {
        jambon = true;
        return this;
    }

    public PizzaBuilder addChampignons() {
        champignons = true;
        return this;
    }

    public PizzaBuilder addAnchois() {
        anchois = true;
        return this;
    }

    public PizzaBuilder addSauceTomate() {
        sauceTomate = true;
        return this;
    }

    public PizzaBuilder addLardons() {
        lardons = true;
        return this;
    }

    public PizzaBuilder addCremeFraiche() {
        cremeFraiche = true;
        return this;
    }

    public PizzaBuilder addEmmental() {
        emmental = true;
        return this;
    }

    public Pizza build() {
        Pizza pizza = new Pizza();
        pizza.setAnchois(anchois);
        pizza.setChampignons(champignons);
        pizza.setCremeFraiche(cremeFraiche);
        pizza.setEmmental(emmental);
        pizza.setJambon(jambon);
        pizza.setLardons(lardons);
        pizza.setSauceTomate(sauceTomate);
        return pizza;
    }

}