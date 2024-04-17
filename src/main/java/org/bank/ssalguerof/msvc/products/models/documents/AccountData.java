package org.bank.ssalguerof.msvc.products.models.documents;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase que contiene informacion de un cuenta de ahorro y cuenta corriente.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountData {
  private Double saldo;
}
