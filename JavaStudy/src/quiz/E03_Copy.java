package quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class E03_Copy {
	/*
	  # image 폴더 내부의 모든 내용을 image_copy 폴더 내부로 복사해보세요
	 	
	 	EASY: 그냥 동작만 하면 정답
	 	HARD: 나중에 폴더 구조나 파일 이름이 변하더라도 올바르게 움직이면 정답
	 */
	public static void main(String[] args) throws IOException {
		
		
		File src = new File("image");
		File dst = new File("image_copy");
		
		File[] src_files = src.listFiles();
		
		for(File file : src_files) {
			System.out.println(file);
			System.out.println("디렉토리 여부: " + (file.isDirectory() ? "Y" : "N"));
			System.out.println("------------------");
			
			if(file.isDirectory()) {
				System.out.println("Dir to create:" + file.getName());
				
				File new_dir = new File(dst, file.getName());
				new_dir.mkdirs();
				
				File[] inner_files = file.listFiles();
				
				for(File file2 : inner_files) {
					System.out.println(file2);
					System.out.println("디렉토리 여부2: " + (file2.isDirectory() ? "Y" : "N"));
					System.out.println("------------------");
					
					if(!file2.isDirectory()) {
						FileInputStream in = new FileInputStream(file2);
		 				FileOutputStream out = new FileOutputStream(
		 						new File(new_dir, file2.getName()));
		 				
		 				System.out.println("src2: " + file2);
		 				System.out.println("dst2: " + new File(new_dir, file2.getName()));
		 				
		 				byte[] buffer = new byte[2048];
		 				
		 				int len = -1;
		 				while((len = in.read(buffer)) != -1) {
		 					out.write(Arrays.copyOf(buffer, len));
		 				}
		 				
		 				out.close();
		 				in.close();
					}
				}
				
 			} else {
 				FileInputStream in = new FileInputStream(file);
 				FileOutputStream out = new FileOutputStream(
 						new File(dst, file.getName()));
 				
// 				int _byte = -1;
// 				while((_byte = in.read()) != -1) {
// 					out.write(_byte);
// 				}

				byte[] buffer = new byte[2048];
 				
 				int len = -1;
 				while((len = in.read(buffer)) != -1) {
 					out.write(Arrays.copyOf(buffer, len));
 				}
 				
 				out.close();
 				in.close();
 			}
		}
		
		System.out.println("복사가 모두 끝났습니다");
	}
}
