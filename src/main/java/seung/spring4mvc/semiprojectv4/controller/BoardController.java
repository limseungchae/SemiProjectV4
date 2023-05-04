package seung.spring4mvc.semiprojectv4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import seung.spring4mvc.semiprojectv4.service.BordeService;

@Controller
@RequestMapping("/board")
public class BoardController {

    @Autowired private BordeService bdsrv;


    @GetMapping("/list")
    public ModelAndView list() {
        ModelAndView mv =new ModelAndView();

        mv.setViewName("board/list.tiles");
        mv.addObject("bdlist",bdsrv.readBoard());

        return mv;
    }

}