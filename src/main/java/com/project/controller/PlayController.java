package com.project.controller;

import org.springframework.web.bind.annotation.RestController;

import com.project.service.AccountService;
import com.project.service.GameService;

@RestController
public class PlayController {
    private final GameService gameService;
    private final AccountService accountService;
    
    PlayController(GameService gameService, AccountService accountService){
        this.gameService = gameService;
        this.accountService = accountService;
    }


}
