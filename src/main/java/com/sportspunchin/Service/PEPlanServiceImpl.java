package com.sportspunchin.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sportspunchin.mapper.PEPlanMapper;
import com.sportspunchin.pojo.PEPlan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Service
@Transactional
public class PEPlanServiceImpl implements PEPlanService {
    private PEPlanMapper pePlanMapper;

    @Override
    public List<PEPlan> findAll() {
        return pePlanMapper.selectList(null);
    }

    public boolean deletePEPlan(Integer id){
        int i = pePlanMapper.deleteById(id);
        if (i>0){
            return true;
        }else{
            return false;
        }
    }


//    //根据id删除书籍
//    @GetMapping("/delete/{id}")
//    public String deleteBookById(@PathVariable("id") Integer id, RedirectAttributes attributes) {
//        boolean b = bookService.deleteBookById(id);
//        if (b) {
//            attributes.addFlashAttribute("message", "删除书籍成功");
//            return "redirect:";
//        } else {
//            attributes.addFlashAttribute("message", "删除书籍失败");
//            return "redirect:";
//        }
//    }




}
