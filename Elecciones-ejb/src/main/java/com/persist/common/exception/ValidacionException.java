/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.persist.common.exception;

/**
 *
 * @author PabloA
 */
public class ValidacionException extends RuntimeException{
   public ValidacionException(String message) {
       super(message);
   }
}