
package com.example.demo.ResponseDTO;

import com.example.demo.Enum.CardType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CardDto {

    private String cardNo;

    private CardType cardType;
}