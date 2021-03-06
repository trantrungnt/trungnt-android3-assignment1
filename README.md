# trungnt-android3-assignment1
##Yêu cầu kiến thức
+ Hiểu về Activity (định nghĩa, hoạt động, vòng đời của Activity)
+ Hiểu về Linear Layout 
+ Hiểu về Cấu trúc Project Android
+ Sử dụng được intent dạng không truyền thông điệp để chuyển đổi giữa các activity (dùng intent trường hợp này không truyền thông điệp gì từ activity này sang activity khác)

##Yêu cầu làm bài tập
+ Tạo giao diện MainActivity
+ Tạo giao diện RedActitvity
+ Tạo giao diện BlueAcitivty
+ Khi nhấn nút R thì hiện ra giao diện RedActivity
+ Khi nhấn nút B thì hiện ra giao diện BlueActvity
+ Khi nhấn nút G thì giao diện MainActivity đóng

![Bài tập về nhà Activity](http://i477.photobucket.com/albums/rr132/trungepu/12376623_1011441425597964_8135374031540706339_n_zps8w5689ek.jpg)

##Chú ý khi code
+ Dùng View.OnClickListener để gọi nhiều sự kiện Click nhiều lần trong các Button mà có chung sự kiện click chuột
```
public class MainActivity extends AppCompatActivity implements View.OnClickListener{
....
private void connectButton(View v) {
        /////////////////////////////////////////////////////////////////////////////////////////
        //Xet dieu kien de dung phuong thuc click phu hop cho tung nut Button
        int id = v.getId();

        /*btnRed0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenRedActivity();
            }
        });*/

        //kiem co phai la nut btnRed khong?
        if ((id == R.id.btnRed0)
            || (id == R.id.btnRed1)
            || (id == R.id.btnRed2)
            || (id == R.id.btnRed3)
            || (id == R.id.btnRed4)
            || (id == R.id.btnRed5)
            || (id == R.id.btnRed6)
            ) {
            OpenRedActivity();
        }

        //kiem tra day co phai la nut btnBlue khong?
        if ((id == R.id.btnBlue0)
            || (id == R.id.btnBlue1)
            || (id == R.id.btnBlue2)
            || (id == R.id.btnBlue3)
            || (id == R.id.btnBlue4)
            || (id == R.id.btnBlue5)
           )
        {
            OpenBlueActvity();
        }

        //kiem tra day co phai la nut btnGreen
        if ((id == R.id.btnGreen0)
            || (id == R.id.btnGreen1)
            || (id == R.id.btnGreen2)
            || (id == R.id.btnGreen3)
            || (id == R.id.btnGreen4)
            || (id == R.id.btnGreen5)
            || (id == R.id.btnGreen6)
           )
        {
            //dong MainActivity
            this.finish();
        }
    }

 @Override
    public void onClick(View v) {
        connectButton(v);
    }
}
```
+ Nhớ tìm ID của nút Button, đăng ký lắng nghe sự kiện click cho nút Button và gọi trong phương thức onCreate(Bundle savedInstanceState)
```
 @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViewButton();
    }

   /////////////////////////////////////////////////////////////////////////////////////////
   private void initViewButton()
    {
        //tim id cua Button
        btnBlue0 = (Button) this.findViewById(R.id.btnBlue0);
        btnBlue1 = (Button) this.findViewById(R.id.btnBlue1);
        btnBlue2 = (Button) this.findViewById(R.id.btnBlue2);
        btnBlue3 = (Button) this.findViewById(R.id.btnBlue3);
        btnBlue4 = (Button) this.findViewById(R.id.btnBlue4);

        btnGreen0 = (Button) this.findViewById(R.id.btnGreen0);
        btnGreen1 = (Button) this.findViewById(R.id.btnGreen1);
        btnGreen2 = (Button) this.findViewById(R.id.btnGreen2);
        btnGreen3 = (Button) this.findViewById(R.id.btnGreen3);
        btnGreen4 = (Button) this.findViewById(R.id.btnGreen4);
        btnGreen5 = (Button) this.findViewById(R.id.btnGreen5);

        btnRed0 = (Button) this.findViewById(R.id.btnRed0);
        btnRed1 = (Button) this.findViewById(R.id.btnRed1);
        btnRed2 = (Button) this.findViewById(R.id.btnRed2);
        btnRed3 = (Button) this.findViewById(R.id.btnRed3);
        btnRed4 = (Button) this.findViewById(R.id.btnRed4);
        btnRed5 = (Button) this.findViewById(R.id.btnRed5);

        //btnBlue
        btnBlue0.setOnClickListener(this);
        btnBlue1.setOnClickListener(this);
        btnBlue2.setOnClickListener(this);
        btnBlue3.setOnClickListener(this);
        btnBlue4.setOnClickListener(this);

        //btnGreen
        btnGreen0.setOnClickListener(this);
        btnGreen1.setOnClickListener(this);
        btnGreen2.setOnClickListener(this);
        btnGreen3.setOnClickListener(this);
        btnGreen4.setOnClickListener(this);
        btnGreen5.setOnClickListener(this);

        //btnRed
        btnRed0.setOnClickListener(this);
        btnRed1.setOnClickListener(this);
        btnRed2.setOnClickListener(this);
        btnRed3.setOnClickListener(this);
        btnRed4.setOnClickListener(this);
        btnRed5.setOnClickListener(this);

    }
``` 

+ Trong file AndroidManifest.xml, khi khai báo mới các Activity: RedAcitivy, BlueActivity thì nhớ thêm cho các activity này sử dụng android:theme nào? 
```
        <activity android:name=".RedActivity"
            android:theme="@style/AppTheme.NoActionBar"
            android:label="@string/app_name_red_activity">
        </activity>

        <activity android:name=".BlueAcitivity"
            android:theme="@style/AppTheme"
            android:label="@string/app_name">
        </activity>
```
+ Khi đặt tên Ảnh thì chú ý đặt tên đúng quy tắc kiểu như: sun, sport, music ... (viết tên ảnh là chữ thường, không sử dụng ký tự đặc biệt -> theo kinh nghiệm của cá nhân tôi làm để tránh lỗi phát sinh)

+ Sử dụng Intent để chuyển đổi giữa các Acitivity với nhau
```
private void OpenBlueActvity()
    {
        Intent intentBlueActivity = new Intent(this, BlueAcitivity.class);
        startActivity(intentBlueActivity);
    }

    private void OpenRedActivity()
    {
        Intent intentRedActivity = new Intent(this,  RedActivity.class);
        startActivity(intentRedActivity);
    }
```

##Môi trường phát triển
+ Bộ công cụ Android Studio
+ App Android phiên bản 4.3 chạy trên máy ảo Genymotion phiên bản Android version 4.3 (API 18)

##Tham khảo
+ [Bảng mã màu của Google](https://www.google.com/design/spec/style/color.html#color-color-palette)
+ [Trang web online xử lý ảnh đẻ làm icon cho app Android](http://www.online-image-editor.com/)
+ [Sử dụng GridView trong Android](http://developer.android.com/intl/vi/guide/topics/ui/layout/gridview.html)

##Demo sản phẩm
+ [Đây là video demo sản phẩm của tôi](https://www.youtube.com/watch?v=Pqp7R3NUmYE)


