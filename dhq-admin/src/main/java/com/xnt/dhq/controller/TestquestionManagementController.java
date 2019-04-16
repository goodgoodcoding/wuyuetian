package com.xnt.dhq.controller;

import com.xnt.dhq.dto.AnswerQuestionParam;
import com.xnt.dhq.dto.ChoiceQuestionParam;
import com.xnt.dhq.dto.CommonResult;
import com.xnt.dhq.dto.FillQuestionParam;
import com.xnt.dhq.model.AnswerQuestion;
import com.xnt.dhq.model.ChoiceQuestion;
import com.xnt.dhq.model.FillQuestion;
import com.xnt.dhq.service.AnswerQuestionService;
import com.xnt.dhq.service.ChoiceQuestionService;
import com.xnt.dhq.service.FillQuestionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@Api(tags = " TestquestionManagementController",description = "学科知识试题管理")
@RequestMapping("/testquestionmanagement")
public class TestquestionManagementController {
    @Resource
    private ChoiceQuestionService choiceQuestionService;
    @ApiOperation("增加选择题")
    @RequestMapping(value = "/createchoice", method = RequestMethod.POST)
    @ResponseBody
    public Object create(@RequestBody ChoiceQuestionParam choiceQuestionParam){
        int count=choiceQuestionService.createChoice(choiceQuestionParam);
        if (count > 0) {
            return new CommonResult().success(count);
        } else {
            return new CommonResult().failed();
        }
    }
    @Resource
    private AnswerQuestionService answerQuestionService;
    @ApiOperation("增加简答题")
    @RequestMapping(value = "/createanswer",method = RequestMethod.POST)
    @ResponseBody
    public Object createAnswer(@RequestBody AnswerQuestionParam answerQuestionParam){
        int count=answerQuestionService.createAnswer(answerQuestionParam);
        if (count > 0) {
            return new CommonResult().success(count);
        } else {
            return new CommonResult().failed();
        }
    }
    @Resource
    private FillQuestionService fillQuestionService;
    @ApiOperation("增加填空题")
    @RequestMapping (value = "/createfill",method = RequestMethod.POST)
    @ResponseBody
    public Object createFill(@RequestBody FillQuestionParam fillQuestionParam){
        int count=fillQuestionService.createFill(fillQuestionParam);
        if (count > 0) {
            return new CommonResult().success(count);
        } else {
            return new CommonResult().failed();
        }
    }

    @ApiOperation("分页获取全部选择题信息")
    @RequestMapping(value = "/listAllchoice",method = RequestMethod.GET)
    @ResponseBody
    public Object ListAllchoice( @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                 @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize){
        List<ChoiceQuestion> choiceQuestionList= choiceQuestionService.listAllchoice(pageNum,pageSize);
        return new CommonResult().pageSuccess(choiceQuestionList);
    }

    @ApiOperation("分页获取全部简答题信息")
    @RequestMapping(value = "/listAllanswer",method = RequestMethod.GET)
    @ResponseBody
    public Object ListAllanswer(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize){
        List<AnswerQuestion> answerQuestionList=answerQuestionService.listAllanswer(pageNum,pageSize);
        return new CommonResult().success(answerQuestionList);
    }

    @ApiOperation("分页获取全部填空题信息")
    @RequestMapping(value = "/listAllfill",method = RequestMethod.GET)
    @ResponseBody
    public Object ListAllfill(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                              @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize){
        List<FillQuestion> fillQuestionList=fillQuestionService.listAllfill(pageNum,pageSize);
        return new CommonResult().success(fillQuestionList);
    }

    @ApiOperation("分页多条件查询简答题信息")
    @RequestMapping(value ="/listsomeanswer" ,method = RequestMethod.GET)
    @ResponseBody
    public Object getListanswer(AnswerQuestionParam answerQuestionParam,
                                @RequestParam(value = "pageSize",defaultValue = "5") Integer pageSize,
                                @RequestParam(value="pageNum",defaultValue = "1")Integer pageNum){
        List<AnswerQuestion> answerQuestionList=answerQuestionService.listanswer(answerQuestionParam,pageSize,pageNum);
        return new CommonResult().pageSuccess(answerQuestionList);
    }


    @ApiOperation("分页多条件查询填空题信息")
    @RequestMapping(value ="/listsomefill" ,method = RequestMethod.GET)
    @ResponseBody
    public Object getListfill(FillQuestionParam fillQuestionParam,
                              @RequestParam(value = "pageSize",defaultValue = "5") Integer pageSize,
                              @RequestParam(value="pageNum",defaultValue = "1")Integer pageNum){
        List<FillQuestion> fillQuestionList=fillQuestionService.listfill(fillQuestionParam,pageSize,pageNum);
        return new CommonResult().pageSuccess(fillQuestionList);
    }


//    @ApiOperation("分页多条件查询选择题信息")
//    @RequestMapping(value ="/listsomechoice" ,method = RequestMethod.GET)
//    @ResponseBody
//    public Object getListchoice(Integer grade,String difficulty_level,String subject,
//                                @RequestParam(value = "pageSize",defaultValue = "5") Integer pageSize,
//                                @RequestParam(value="pageNum",defaultValue = "1")Integer pageNum) {
//        List<ChoiceQuestion> choiceQuestionList=choiceQuestionService.listchoice(grade,difficulty_level,subject,pageSize,pageNum);
//        if(choiceQuestionList.size()>0){
//            return new CommonResult().pageSuccess(choiceQuestionList);
//        }else{
//            return new CommonResult().failed();
//        }
//    }



    @ApiOperation("更新选择题")
    @RequestMapping(value = "/updatechoice",method = RequestMethod.POST)
    @ResponseBody
    public Object updatechoice(@RequestBody ChoiceQuestionParam choiceQuestionParam, BindingResult bindingResult){
        int count=choiceQuestionService.updatechoice(choiceQuestionParam);
        if(count>0){
            return new CommonResult().success(count);
        }else{
            return new CommonResult().failed();
        }
    }

    @ApiOperation("更新简答题")
    @RequestMapping(value = "/updateanswer",method = RequestMethod.POST)
    @ResponseBody
    public Object updateanswer(@RequestBody AnswerQuestionParam answerQuestionParam, BindingResult bindingResult){
        int count=answerQuestionService.updateanswer(answerQuestionParam);
        if(count>0) {
            return new CommonResult().success(count);
        }else{
            return new CommonResult().failed();
        }
    }

    @ApiOperation("更新填空题")
    @RequestMapping(value = "/updatefill",method = RequestMethod.POST)
    @ResponseBody
    public Object updatefill(@RequestBody FillQuestionParam fillQuestionParam, BindingResult bindingResult){
        int count=fillQuestionService.updatefill(fillQuestionParam);
        if(count>0){
            return new CommonResult().success(count);
        }else{
            return new CommonResult().failed();
        }
    }


    @ApiOperation(value = "删除选择题")
    @RequestMapping(value = "/deletechoice/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Object deletechoice(int choiceid){
        int count=choiceQuestionService.deletechoice(choiceid);
        if(count==1){
            return new CommonResult().success(null);
        }else{
            return new CommonResult().failed();
        }
    }

    @ApiOperation(value = "删除简答题")
    @RequestMapping(value = "/deleteanswer/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Object deleteanswer(int answerid){
        int count=choiceQuestionService.deletechoice(answerid);
        if(count==1){
            return new CommonResult().success(null);
        }else{
            return new CommonResult().failed();
        }
    }
    @ApiOperation(value = "删除填空题")
    @RequestMapping(value = "/deletefill/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Object deletefill(int fillid){
        int count=choiceQuestionService.deletechoice(fillid);
        if(count==1){
            return new CommonResult().success(null);
        }else{
            return new CommonResult().failed();
        }
    }


    @ApiOperation("批量删除选择题")
    @RequestMapping(value = "/deletechoice",method = RequestMethod.POST)
    @ResponseBody
    public Object deletechoice(@RequestParam("choiceids") List<Integer> choiceids){
        int count=choiceQuestionService.deletechoice(choiceids);
        if(count>0){
            return new CommonResult().success(count);
        }
        return new CommonResult().failed();
    }

    @ApiOperation("批量删除填空题")
    @RequestMapping(value = "/deletefill",method = RequestMethod.POST)
    @ResponseBody
    public Object deletefill(@RequestParam("fillids") List<Integer> fillids){
        int count=fillQuestionService.deletefill(fillids);
        if(count>0){
            return new CommonResult().success(count);
        }
        return new CommonResult().failed();
    }


    @ApiOperation("批量删除简答题")
    @RequestMapping(value = "/deleteanswer",method = RequestMethod.POST)
    @ResponseBody
    public Object deleteanswer(@RequestParam("answerids") List<Integer> answerids){
        int count=fillQuestionService.deletefill(answerids);
        if(count>0){
            return new CommonResult().success(count);
        }
        return new CommonResult().failed();
    }



}
