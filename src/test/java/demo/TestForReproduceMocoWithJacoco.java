package demo;

import com.github.dreamhead.moco.Moco;
import com.github.dreamhead.moco.junit.MocoJunitRunner;
import org.apache.http.HttpResponse;
import org.apache.http.client.fluent.Request;
import org.junit.Rule;
import org.junit.Test;

import java.io.IOException;

public class TestForReproduceMocoWithJacoco {
    @Rule
    public MocoJunitRunner runner = MocoJunitRunner.jsonHttpRunner(12306, Moco.pathResource("foo.json"));

    @Test
    public void  mockTest() throws IOException {
        HttpResponse httpResponse = Request.Get("http://localhost:12306").execute().returnResponse();
        System.out.println(httpResponse);
    }
}