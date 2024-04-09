package io.github.admgk.indicator;

import com.fasterxml.jackson.databind.ObjectMapper;
import javax.servlet.annotation.WebServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Indicator", urlPatterns = "/api/indicator")
public class IndicatorServlet extends HttpServlet {
    private static final String IND_PARAM = "ind";

    private IndicatorService service;
    private ObjectMapper mapper;

    public IndicatorServlet() {
        this(new IndicatorService(), new ObjectMapper());
    }

    IndicatorServlet(IndicatorService service, ObjectMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        var indicator = req.getParameter(IND_PARAM);

        resp.setContentType("application/json;charset=UTF-8");
        mapper.writeValue(resp.getOutputStream(), service.invokeRepositoryOf(indicator));
    }
}
