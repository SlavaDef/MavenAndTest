package org.example;

import com.google.gson.Gson;
import org.apache.log4j.BasicConfigurator;
import org.example.dto.CurrencyDto;
import org.example.dto.DogDto;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


public class Main {
    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(Main.class);


    public static void main(String[] args) {
        BasicConfigurator.configure(); // конфігуратор для логгера

// уявляємо що до нас прийшов json
        String cur = "{\n"
                + "   \"currency\" : \"USD\",\n"
                + "  \"value\" : \"4.05\"\n"
                + "}";

        // в класі CurrencyDto є дві змінні які будуть відповідати значенням currency і value
        CurrencyDto item = new Gson().fromJson(cur, CurrencyDto.class);
        // отримали значення value з уявного джейсона в нащому випадку зі String
      //  System.out.println(item.getValue());
        // отримали значення currency з уявного джейсона в нащому випадку зі String
      //  System.out.println(item.getCurrency());
        // обо завяки переопреділенню метоу toString() вивести все оразу
      //  System.out.println(item);
        item.log();
        LOGGER.info("Continue"); // повідомлення заміні printLn


        // тут вже створюємо Gson і потім його додамо
       CurrencyDto currencyDto =  new CurrencyDto("UA", 38.5);
        Gson gson = new Gson();

       String cur2 = gson.toJson(currencyDto); // створюємо змінну з  Gson
     //  System.out.println(cur2); // виводимо отриманий Gson
        LOGGER.info(cur2); // чи так виводимо отриманий Gson

       currencyDto = gson.fromJson(cur2, CurrencyDto.class);

     //  System.out.println(currencyDto); // далі виводимо все + нові змінні
     //  System.out.println(currencyDto.getCurrency());
     //  System.out.println(currencyDto.getValue()); // ? ??

        currencyDto.log(); // також покаже який потік що виконує
        LOGGER.info(currencyDto.getCurrency());
        LOGGER.info(""+ currencyDto.getValue());



        DogDto dogDto = new DogDto("Jack", 5,
                2017, "AI778833YY", "Chrechatik street 15, 22");

        Gson gson1 = new Gson();
        String dogStr = gson1.toJson(dogDto);
      //  System.out.println(dogStr);
        LOGGER.info(dogStr);

       DogDto dogDto1 = gson1.fromJson(dogStr, DogDto.class);
     //  System.out.println(dogDto1);
        LOGGER.info(""+dogDto1);


    }
}