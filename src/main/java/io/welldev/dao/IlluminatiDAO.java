package io.welldev.dao;

import io.welldev.model.Illuminati;

import java.util.List;

public interface IlluminatiDAO {

    public void createIlluminati(Illuminati illuminati);

    public List<Illuminati> listIlluminati();
}
