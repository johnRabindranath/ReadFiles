package com.readFile.text;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.google.gson.Gson;
import com.readFile.repository.UserRepository;

/**
 * 
 * @author John Rabindranath
 *
 */
@RestController
public class UserController {
	@Autowired
	private UserRepository userRepository;

	@PostMapping("/readFile")
	public String readFile(@RequestParam("file") MultipartFile file) throws IOException {
		ArrayList<User> users = new ArrayList<>();
		InputStream is = file.getInputStream();
		BufferedReader brs = null;
		try {
			brs = new BufferedReader(new InputStreamReader(is));
			String sCurrentLine;

			while ((sCurrentLine = brs.readLine()) != null) {
				User user = new User();
				String datas[] = sCurrentLine.split(",");
				user.setUsename(datas[1]);
				user.setFirstname(datas[2]);
				user.setLastname(datas[3]);
				user.setPassword(datas[4]);
				user.setStatus(datas[5]);
				userRepository.save(user);
				users.add(user);

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Gson gson = new Gson();
		String userJson = gson.toJson(users);

		return userJson;
	}
}
