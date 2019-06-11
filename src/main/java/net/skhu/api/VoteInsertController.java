package net.skhu.api;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.skhu.domain.Member;
import net.skhu.dto.PwsReq;
import net.skhu.dto.SignUpRequest;
import net.skhu.service.SignUpService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@Slf4j
@RestController
@RequiredArgsConstructor
public class VoteInsertController {

    private final SignUpService signUpService;

    @PostMapping("/api/v1/signUp")
    public ResponseEntity<Member> createAccount(@Valid @RequestBody SignUpRequest signUpRequest) {
        Member member = signUpService.signUp(signUpRequest);
        return new ResponseEntity<>(member, HttpStatus.OK);
    }

    //입후보 등록
    @GetMapping("creCandidate")
    public String createCandidate(Model model ){


        return "users/creCandidate";
    }





}