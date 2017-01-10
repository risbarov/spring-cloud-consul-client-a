package org.sf.cloud.consul.discovery.web;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

	@Autowired
	private ApplicationContext applicationContext;

	@RequestMapping(method = RequestMethod.GET, value = "/ping", produces = MediaType.APPLICATION_JSON_VALUE)
	public PingResponse ping() {
		return new PingResponse(applicationContext.getId(), LocalDateTime.now());
	}

	public class PingResponse {

		private String id;

		private LocalDateTime ts;

		public PingResponse(String id, LocalDateTime ts) {
			this.id = id;
			this.ts = ts;
		}

		public String getId() {
			return id;
		}

		public LocalDateTime getTs() {
			return ts;
		}

	}

}
