package seung.spring4mvc.semiprojectv4.service;

import seung.spring4mvc.semiprojectv4.model.Member;

import javax.servlet.http.HttpSession;

public interface Memberservice {
    boolean checkLogin(Member m, HttpSession sess);
}
