package seung.spring4mvc.semiprojectv4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import seung.spring4mvc.semiprojectv4.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {

    @Autowired private BoardService bdsrv;


    @GetMapping("/list")
    public ModelAndView list(int cpg) {
        ModelAndView mv =new ModelAndView();
        // System.out.println(bdsrv.readBoard(cpg).size());

        mv.setViewName("board/list.tiles");

        mv.addObject("bdlist",bdsrv.readBoard(cpg));
        mv.addObject("cpg", cpg);
        mv.addObject("stpg", ((cpg - 1) / 10) * 10 + 1);


        return mv;
    }

}