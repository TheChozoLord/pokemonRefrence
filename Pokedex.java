package PokemonShowing;

import java.util.ArrayList;

public class Pokedex {
    // <Place comments here>
    private ArrayList<Pokemon> pokemonArrayList = new ArrayList<>();

    public void addPokemon(Pokemon pokemon) {
        pokemonArrayList.add(pokemon);
    }

    public void removePokemon(Pokemon pokemon) {
        pokemonArrayList.remove(pokemon);
    }
    public ArrayList<Pokemon> getAllPokemon() {
        return pokemonArrayList;
    }

    public Pokemon getPokemon(String pokemonName) {
        Pokemon foundPokemon = null;
        for (Pokemon pokemon : pokemonArrayList) {
            if (pokemon.getName().equals(pokemonName)) {
                foundPokemon = pokemon;
                break;
            }
        }
        return foundPokemon;
    }


}