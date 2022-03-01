package pao.classes;

import java.util.Objects;

public class Cat extends Animal {

    private CatBreed catBreed;

    public Cat(String name, String sound, CatBreed catBreed) {
        super(name,sound);
        this.catBreed = catBreed;
    }

    public CatBreed getCatBreed() {
        return catBreed;
    }

    public void setCatBreed(CatBreed catBreed) {
        this.catBreed = catBreed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return getCatBreed() == cat.getCatBreed();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getCatBreed());
    }

    @Override
    public String toString() {
        return "Cat{" +
                "catBreed=" + catBreed +
                '}';
    }
}
