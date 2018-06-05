package chapter02;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ImageProcess {

    public static final String path1 = "E:\\testFile\\2.jpg";
    public static final String path2 = "E:\\testFile\\1.png";

    public static void main(String[] args) {
        BufferedImage image1 = null;
        BufferedImage image2 = null;
        try {
            image1 = ImageIO.read(new FileInputStream(path1));
            image2 = ImageIO.read(new FileInputStream(path2));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<BufferedImage> list = new ArrayList<>();
        if(image1 != null && image2 != null){
            list.add(image1);
            list.add(image2);
        }
        BufferedImage resultImage = yPic(list);
        try {
            ImageIO.write(resultImage,"jpg", new File("E:\\target\\y.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public static BufferedImage yPic(List<BufferedImage> piclist) {// 纵向处理图片

        // 图片组为空列表
        if (piclist == null || piclist.size() <= 0) {
            return null;
        }
        try {
            int height = 0, // 总高度
                    width = 0, // 总宽度
                    _height = 0, // 偏移高度
                    __height = 0, // 每张图的高度
                    picNum = piclist.size();// 图片的数量
            int[] heightArray = new int[picNum]; // 保存每个文件的高度



            BufferedImage buffer = null; // 保存图片流

            // 所有图片的rgb容器
            List<int[]> imgRGB = new ArrayList<int[]>();
            int[] _imgRGB; // 保存一张图片中的RGB数据
            for (int i = 0; i < picNum; i++) {
                buffer = piclist.get(i);
                // 图片高度
                heightArray[i] = _height = buffer.getHeight();
                if (i == 0) {
                    width = buffer.getWidth();// 图片宽度
                }
                height += _height; // 获取总高度
                _imgRGB = new int[width * _height];// 从图片中读取RGB
                _imgRGB = buffer.getRGB(0, 0, width, _height, _imgRGB, 0, width);
                imgRGB.add(_imgRGB);
            }
            _height = 0; // 设置偏移高度为0
            // 生成新图片
            BufferedImage imageResult = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            for (int i = 0; i < picNum; i++) {
                __height = heightArray[i];
                // 不是第一张图的时候出现偏移高度
                if (i != 0)
                    _height += __height;
                // 创建流
                imageResult.setRGB(0, _height, width, __height, imgRGB.get(i), 0, width);
            }
            return imageResult;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
