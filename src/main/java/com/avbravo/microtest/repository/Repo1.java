/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.avbravo.microtest.repository;

import java.util.Optional;

/**
 *
 * @author avbravo
 */
public interface Repo1 <T extends Object, K extends Object> {

    public <S extends T> S save(S s);

    public <S extends T> Iterable<S> save(Iterable<S> itrbl);

    public void deleteById(K k);

    public void deleteById(Iterable<K> itrbl);

    public Optional<T> findById(K k);

    public Iterable<T> findById(Iterable<K> itrbl);

    public boolean existsById(K k);

    public long count();
}
