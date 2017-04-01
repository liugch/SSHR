import redis.clients.jedis.Jedis;

/**
 * Created by Administrator on 2017/3/31.
 */
public class Test {

    @org.junit.Test
    public void testPing() {
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("localhost");
        System.out.println("Connection to server sucessfully");
        //查看服务是否运行
        System.out.println("Server is running: "+jedis.ping());


    }
}
