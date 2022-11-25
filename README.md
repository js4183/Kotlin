# Kotlin


# Android

### Settings
- File - Settings - Emulator - Launch 체크 해제!
- Restart IDE... - app run - *전원버튼 클릭 금지!!*

<details>
    <summary>2022.11.24</summary>

## class
- 디자인 탭 PreView에서 View클릭한다음에 BackSpace
- ComponentTree에서 View를 선택한다름에 Delete
- Constraint Layout : View들을 서로 겹쳐서 배치 할 수 있다!
- LinearLayout : 선형 (vertical, horizontal)
- inset 뷰가 가진 크기(테두리) 안쪽에 여백 <br/>
![image](https://user-images.githubusercontent.com/112377313/203709659-731ecf8d-c63b-4a51-ad4a-874a599183a7.png) 
- id속성 : xml에 있는 View를 클래스에서 컨트롤해야되는데 View를 Kotlin으로 컨트롤하려면 구분 할 수 있는 값이 필요함(Id:고유값) *같은 Id 사용X

## LinearLayout
- width: 65dp, height: match_parent
  - androidx.constraintlayout.widget.ConstraintLayout -> LinearLayout
  - android:orientation="horizontal"
  - button, text, inset, background
  - ignore, terminate
  
## Layout 종류
- ConstraintLayout <br/>
![image](https://user-images.githubusercontent.com/112377313/203720619-609ec2ba-e7f2-473d-8b69-89b4f7c741f6.png)


- 좌, 우 (1) || 상, 하 (1) 1개씩 연결이 되어 있어야함.

</details>


<details>
    <summary>2022.11.25</summary>
    
### Id 값
- val tvResult = findViewById<TextView>(R.id.tvResult)
    - tv, et, btn... + 기능명시
    - setContentView 위로 find할 수 없음!
    - .setTextColor(Color.BLUE) || (Color.parseColor("#ff9999"))
    - .textSize = 40.0f -> textSize(Float) 40.0(Double)
### btn 이벤트 
- ![image](https://user-images.githubusercontent.com/112377313/203879292-56a76dd3-46f8-428e-9c92-f8dbf7ef2ea9.png)

### img
- TextView, button, EditText, img 기본 뷰 4가지
- res -> drawable -> 파일이름 이미지 시작X
    
</details>
