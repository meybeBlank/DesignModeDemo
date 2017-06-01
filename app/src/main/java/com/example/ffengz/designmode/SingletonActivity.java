package com.example.ffengz.designmode;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;

import com.example.ffengz.designmode.bridge.FiftyMoneyImpl;
import com.example.ffengz.designmode.bridge.GuoTaiFund;
import com.example.ffengz.designmode.bridge.HuiFengFund;
import com.example.ffengz.designmode.bridge.TenMoneyImpl;
import com.example.ffengz.designmode.decorator.AlbumPhotos;
import com.example.ffengz.designmode.decorator.PackPhotos;
import com.example.ffengz.designmode.decorator.Selfie;
import com.example.ffengz.designmode.facade.Phone;
import com.example.ffengz.designmode.flyweight.Ticket;
import com.example.ffengz.designmode.flyweight.TicketFactory;
import com.example.ffengz.designmode.interpreter.AddOperatorExpression;
import com.example.ffengz.designmode.interpreter.Expression;
import com.example.ffengz.designmode.interpreter.NumExpression;
import com.example.ffengz.designmode.interpreter.SubOperatorExpression;

import java.util.Stack;

public class SingletonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleton);

//      // 听云
//        NBSAppAgent.setLicenseKey("99bf7fe0c53f496e87dc03e163f85dc6").withLocationServiceEnabled(true).start(this.getApplicationContext());
//        NBSAppAgent.setLicenseKey("99bf7fe0c53f496e87dc03e163f85dc6").start(this.getApplicationContext());
//      // 第一种 按照顺序实现配置
//        MealBuild mealBuild = new MealBuild();
//        Meal meal = mealBuild.MealOne();
//        meal.showFoods();
//
//        //第二种 隐藏初始化过程，初始化后不可更改
//        Meal bigMeal = new Meal.MealBuild().add(new MealFood())
//                .add(new VegetableFood())
//                .add(new HotSoup())
//                .creat();
//        bigMeal.showFoods();
//
//        // 装载形状
//        ShapeCache.loadShape();
//        // 获取克隆对象
//        Shape shape = ShapeCache.getShape("1");
//        Log.i("info", "onCreate: ==++ " + shape.getType());;
//
//        // 使用工厂进行创建
//        AodiCar car = new CarFactory().createCar(AodiCar.class);
//        BaomaCar car1 = new CarFactory().createCar(BaomaCar.class);
//        Log.i("info", "onCreate: ==++" + car.name());
//        Log.i("info", "onCreate: ==++" + car1.name());
//
//        // 抽象工厂模式创建
//        ShapeFactoryA shapeFactoryA = new ShapeFactoryA();
//        Color color = shapeFactoryA.createColor();
//        Shape shape = shapeFactoryA.createShape();
//        color.paint();
//        shape.draw();
//
//        // 策略模式
//        GoHomeContext goHomeContext = new GoHomeContext();
//        goHomeContext.setStrategy(new CarStrategy());
//        String info = goHomeContext.goHomeBySubway();
//        Log.i("info", "onCreate: ==++" + info);
//
//        // 状态模式
//        LoginStateContext instance = LoginStateContext.getInstance();
//        String transpond = instance.transpond();
//        Log.i("info", "onCreate: ==++" + transpond);
//        // 更改状态
//        instance.setState(new OnLoginState());
//        transpond = instance.transpond();
//        Log.i("info", "onCreate: ==++" + transpond);
//
//        // 责任链模式
//        ParterA parterA = new ParterA();
//        ParterB parterB = new ParterB();
//        parterA.setNextHandler(parterB);
//        // 丢个责任链
//        parterA.handlerMessage("B");
//
//        // 责任链模式  进阶使用
//        // 创建消息
//        MessageA messageA = new MessageA("A同学你好啊！");
//        MessageB messageB = new MessageB("B同学 我稀饭你！");
//        // 创建处理者
//        HandlerA handlerA = new HandlerA();
//        HandlerB handlerB = new HandlerB();
//        // 链 创建
//        handlerA.setNext(handlerB);
//        // 发送消息到链  进行处理
//        handlerA.handleMessage(messageA);
//        handlerA.handleMessage(messageB);
//
//        // 解释器模式
//        int result = calculator("1 + 2 + 3 - 4 + 1");
//        Log.i("info", "onCreate: ==++  1 + 2 + 3 - 4 + 1 运算结果" + result);
//
//        // BigDecimal 精确小数运算
//        BigDecimalTest bigDecimalTest = BigDecimalTest.newInstance();
//        // 精度
//        BigDecimal b1 = bigDecimalTest.testScale("12.152635", 3);
//        BigDecimal b2 = bigDecimalTest.testScale("2.152635", 3);
//        Log.i("info", "onCreate: ==++b1:" + b1.toString());
//        Log.i("info", "onCreate: ==++b2:" + b2.toString());
//        // 乘
//        BigDecimal bigDecimal = bigDecimalTest.testMultiply("2.2", "1.11", 2);
//        Log.i("info", "onCreate: ==++ MUL:" + bigDecimal);
//        // 除
//        BigDecimal bigDecimal = bigDecimalTest.testDivide("1", "3", 0);
//        Log.i("info", "onCreate: ==++ DIv:" + bigDecimal);
//
//        // 命令模式
//        Operator operator = new Operator();
//        TurnOnCommand turnOnCommand = new TurnOnCommand(operator);
//        TurnOffCommand turnOffCommand = new TurnOffCommand(operator);
//
//        // 简单方式
//        Invoker invoker = new Invoker();
//        invoker.setTurnOnCommand(turnOnCommand);
//        invoker.setTurnOffCommand(turnOffCommand);
//        invoker.turnOn();
//        invoker.turnOff();
//
//        // 操作记录序列保存
//        Invoker2 invoker2 = new Invoker2();
//        invoker2.add(turnOnCommand);
//        invoker2.add(turnOnCommand);
//        invoker2.add(turnOffCommand);
//        invoker2.execute();
//        invoker2.record();
//
//        // 观察者模式
//        // 被观察者
//        ConcreteSubject observable = new ConcreteSubject();
//        // 观察者
//        ConcreteObserver observerA = new ConcreteObserver("A");
//        ConcreteObserver observerB = new ConcreteObserver("B");
//        ConcreteObserver observerC = new ConcreteObserver("C");
//        // 绑定观察者
//        observable.attach(observerA);
//        observable.attach(observerB);
//        observable.attach(observerC);
//        // 假设发生改变，进行通知
//        observable.notifyObservers("下雨了！！！");
//
//        //备忘录模式
//        GameOriginator game = new GameOriginator();
//        Log.i("info", "onCreate: ==++" + game.toString());
//        game.play();
//        Log.i("info", "onCreate: ==++" + game.toString());
//        // 存档
//        Caretaker caretaker = new Caretaker();
//        caretaker.add(game.createMememto());
//        // 退出   下一次进入 读档
//        GameOriginator newGame = new GameOriginator();
//        newGame.restore(caretaker.getMemento(0));
//        Log.i("info", "onCreate: ==++" + newGame.toString());
//
//        ConcreteContainer concreteContainer = new ConcreteContainer();
//        concreteContainer.add("第1条");
//        concreteContainer.add("第2条");
//        concreteContainer.add("第3条");
//        concreteContainer.add("第4条");
//        Iterator iterator = concreteContainer.getIterator();
//        while (iterator.hasNext()){
//            Log.i("info", "onCreate: ==++" + iterator.next());
//        }

//        // 模版模式
//        ElephantPut elephantPut = new ElephantPut();
//        elephantPut.putInSomething();
//        XiaoMingPut xiaoMingPut = new XiaoMingPut();
//        xiaoMingPut.putInSomething();

//        // 访问者模式
//        Team team = new Team();
//        // 为男性访问者展示数据
//        team.getInfo(new MaleReportVisitor());
//        // 为女相访问这展示数据
//        team.getInfo(new FemaleReportVisitor());

//        // 中间者模式
//        Mediator mediator = new Mediator();
//        Z3Buyer z3Buyer = new Z3Buyer(mediator);
//        L4Seller l4Seller = new L4Seller(mediator);
//        CenterBank centerBank = new CenterBank(mediator);
//        // 对象设置
//        mediator.setmBuyer(z3Buyer);
//        mediator.setmSeller(l4Seller);
//        mediator.setmBank(centerBank);
//        // 张三买房
//        z3Buyer.buyHouse();

//        // 代理模式
//        RealSurfing realSurfing = new RealSurfing();
//        ProxySurfing proxySurfing = new ProxySurfing(realSurfing);
//        // 通过代理访问真实的上网
//        proxySurfing.surfing();

//        // 组合模式
//        // 根节点
//        Component root = new Truck("root");
//        // 为根节点创建并添加子节点
//        Truck truck1 = new Truck("truck1");
//        Leaf leaf1 = new Leaf("leaf1");
//        root.addChild(truck1);
//        root.addChild(leaf1);
//        // 为树干节点创建添加子节点
//        Leaf leaf2 = new Leaf("leaf2");
//        truck1.addChild(leaf2);

//        // 适配器模式
//        HdmiToVgaAdapter hdmiToVgaAdapter = new HdmiToVgaAdapter(new GTX10());
//        hdmiToVgaAdapter.needVGA();

//        // 装饰模式
//        // 创建一个自拍
//        Selfie selfie = new Selfie("大帅比的自拍");
//        Log.i("info", "onCreate:==++ " + selfie.getPhoto());
//        // 创建装饰类
//        PackPhotos packPhotos = new PackPhotos(selfie);
//        // 调用装饰之后的照片对象方法
//        Log.i("info", "onCreate:==++ " + packPhotos.getPhoto());
//        AlbumPhotos albumPhotos = new AlbumPhotos(selfie);
//        Log.i("info", "onCreate:==++ " + albumPhotos.getPhoto());

//        // 享元模式
//        Ticket ticket1 = TicketFactory.getTicket("北京", "上海");
//        Ticket ticket2 = TicketFactory.getTicket("北京", "成都");
//        Ticket ticket3 = TicketFactory.getTicket("北京", "上海");
//        Log.i("info", "onCreate: ==++" + ticket1.toString());
//        ticket1.showSite();
//        Log.i("info", "onCreate: ==++" + ticket2.toString());
//        ticket2.showSite();
//        Log.i("info", "onCreate: ==++" + ticket3.toString());
//        ticket3.showSite();

//        // 外观模式
//        Phone phone = new Phone();
//        phone.takePhotos();
//        phone.callTo("张三的手机111");.

        // 桥接模式
        // 创建具体的金额
        TenMoneyImpl tenMoney = new TenMoneyImpl();
        FiftyMoneyImpl fiftyMoney = new FiftyMoneyImpl();
        // 创建不同的定投基金
        GuoTaiFund guoTaiFund = new GuoTaiFund(tenMoney);
        HuiFengFund huiFengFund = new HuiFengFund(fiftyMoney);
        // 打印基本信息
        guoTaiFund.info();
        huiFengFund.info();
    }

    // 声明计算器栈  保存所有运算信息
    private Stack<Expression> mCalculator = new Stack<>();

    /**
     * 计算方法
     *
     * @param context 计算表达式
     */
    private int calculator(@NonNull String context) {
        // 运算符号两边的数字
        Expression numExp1, numExp2;
        // 分割表达式的字符串
        String[] elements = context.split(" ");

        // 构造运算
        for (int i = 0; i < elements.length; i++) {
            switch (elements[i].charAt(0)) {
                case '+': // 为 加法运算
                    // 弹出左侧的数字解释器
                    numExp1 = mCalculator.pop();
                    // 构造下一个数字解释器  同时跳过下一个数字的解析
                    numExp2 = new NumExpression(Integer.valueOf(elements[++i]));
                    // 构造加法运算解释器 并压栈
                    AddOperatorExpression item1 = new AddOperatorExpression(numExp1, numExp2);
                    mCalculator.push(item1);
                    break;
                case '-': // 为 减法运算
                    // 弹出左侧的数字解释器
                    numExp1 = mCalculator.pop();
                    // 构造下一个数字解释器  同时跳过下一个数字的解析
                    numExp2 = new NumExpression(Integer.valueOf(elements[++i]));
                    // 构造加法运算解释器 并压栈
                    SubOperatorExpression item = new SubOperatorExpression(numExp1, numExp2);
                    mCalculator.push(item);
                    break;
                default:
                    NumExpression numExp = new NumExpression(Integer.valueOf(elements[i]));
                    // 将数字解释器压栈
                    mCalculator.push(numExp);
                    break;
            }
        }

        // 进行计算
        return mCalculator.pop().interpret(0);
    }

}
