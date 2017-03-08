package com.jshop.mytest;

import net.jeeshop.services.front.account.AccountService;
import net.jeeshop.services.front.account.bean.Account;
import net.jeeshop.services.front.address.AddressService;
import net.jeeshop.services.front.area.AreaService;
import net.jeeshop.services.front.attribute.AttributeService;
import net.jeeshop.services.front.attribute_link.Attribute_linkService;
import net.jeeshop.services.front.catalog.CatalogService;
import net.jeeshop.services.front.comment.CommentService;
import net.jeeshop.services.front.commentType.CommentTypeService;
import net.jeeshop.services.front.email.EmailService;
import net.jeeshop.services.front.emailNotifyProduct.EmailNotifyProductService;
import net.jeeshop.services.front.express.ExpressService;
import net.jeeshop.services.front.favorite.FavoriteService;
import net.jeeshop.services.front.indexImg.IndexImgService;
import net.jeeshop.services.front.keyvalue.KeyvalueService;
import net.jeeshop.services.front.navigation.NavigationService;
import net.jeeshop.services.front.news.NewsService;
import net.jeeshop.services.front.notifyTemplate.NotifyTemplateService;
import net.jeeshop.services.front.order.OrderService;
import net.jeeshop.services.front.orderdetail.OrderdetailService;
import net.jeeshop.services.front.orderlog.OrderlogService;
import net.jeeshop.services.front.orderpay.OrderpayService;
import net.jeeshop.services.front.ordership.OrdershipService;
import net.jeeshop.services.front.pay.PayService;
import net.jeeshop.services.front.product.ProductService;
import net.jeeshop.services.front.questionnaire.QuestionnaireService;
import net.jeeshop.services.front.questionnaireItem.QuestionnaireItemService;
import net.jeeshop.services.front.questionnaireResult.QuestionnaireResultService;
import net.jeeshop.services.front.systemSetting.SystemSettingService;
import net.jeeshop.services.front.systemSetting.bean.SystemSetting;
import net.jeeshop.services.front.systemlog.SystemlogService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by asus on 2017/3/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/applicationContext.xml","classpath*:spring/spring-mvc.xml"})
public class FrontService {

    @Autowired
    private AccountService accountService;
    @Autowired
    private AddressService addressService;
    @Autowired
    private AreaService areaService;
    @Autowired
    private AttributeService attributeService;
    @Autowired
    private Attribute_linkService attribute_linkService;
    @Autowired
    private CatalogService catalogService;
    @Autowired
    private CommentService commentService;
    @Autowired
    private CommentTypeService commentTypeService;
    @Autowired
    private EmailService emailService;
    @Autowired
    private EmailNotifyProductService emailNotifyProductService;
    @Autowired
    private ExpressService expressService;
    @Autowired
    private FavoriteService favoriteService;
    @Autowired
    private IndexImgService indexImgService;
    @Autowired
    private KeyvalueService keyvalueService;
    @Autowired
    private NavigationService navigationService;
    @Autowired
    private NewsService newsService;
    @Autowired
    private NotifyTemplateService notifyTemplateService;
    @Autowired
    private OrderService orderService;
    @Autowired
    private OrderdetailService orderdetailService;
    @Autowired
    private OrderlogService orderlogService;
    @Autowired
    private OrderpayService orderpayService;
    @Autowired
    private OrdershipService ordershipService;
    @Autowired
    private PayService payService;
    @Autowired
    private ProductService productService;
    @Autowired
    private  QuestionnaireService questionnaireService;
    @Autowired
    private QuestionnaireItemService questionnaireItemService;
    @Autowired
    private QuestionnaireResultService questionnaireResultService;
    @Autowired
    private SystemlogService systemlogService;
    @Autowired
    private SystemSettingService systemSettingService;

    @Before
    public void Init()
    {
//        ApplicationContext ctx = new FileSystemXmlApplicationContext("classpath*:spring/applicationContext.xml","classpath*:spring/spring-mvc.xml");
//        accountService = (AccountService)ctx.getBean(AccountService.class);
    }
    @Test
    public void selectById()
    {
        Account account = accountService.selectById("70");
    }
}
