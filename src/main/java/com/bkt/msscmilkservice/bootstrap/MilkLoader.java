package com.bkt.msscmilkservice.bootstrap;

import com.bkt.msscmilkservice.domain.Milk;
import com.bkt.msscmilkservice.repositories.MilkRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class MilkLoader implements CommandLineRunner {

    private final MilkRepository milkRepository;

    public MilkLoader(MilkRepository milkRepository) {
        this.milkRepository = milkRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadMilkObjets();
    }

    private void loadMilkObjets() {
        if (milkRepository.count() == 0 ){
            milkRepository.save(Milk.builder()
                    .milkName("Mango Bobs")
                    .milkStyle("IPA")
                    .quantityToBrew(200)
                    .minOnHand(12)
                    .upc(34543535L)
                    .price(new BigDecimal("12.95"))
                    .build());

            milkRepository.save(Milk.builder()
                    .milkName("Galaxy Cat")
                    .milkStyle("PALE ALE")
                    .quantityToBrew(200)
                    .minOnHand(12)
                    .upc(34543537L)
                    .price(new BigDecimal("11.95"))
                    .build());
        }

        System.out.println("Loader Milk " +  milkRepository.count());
    }
}
