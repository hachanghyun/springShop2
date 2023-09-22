## 1. Deployment URL 
  https://github.com/hachanghyun/springShop2
  
## 2. Summary
### 주요 기능

##### (1).기본적으로 로그인 및 회원 가입 기능이 있다.
<img width="1438" alt="스크린샷 2023-09-09 오후 2 07 14" src="https://github.com/hachanghyun/springShop2/assets/33058284/aac8fb75-250a-47e4-a8ca-ec52db39c065">
<img width="1440" alt="스크린샷 2023-09-09 오후 2 07 21" src="https://github.com/hachanghyun/springShop2/assets/33058284/25d9d203-a4e8-418f-8aa3-2c4f1c568fb0">

##### (2).메인화면으로 탑 메뉴와 배너, 상품 목록을 볼수 있으며 탑 메뉴에서는 상품등록, 상품관리, 장바구니, 구매이력 메뉴가 있다.
<img width="1440" alt="스크린샷 2023-09-09 오후 1 45 14" src="https://github.com/hachanghyun/springShop2/assets/33058284/65925fc8-ae8e-4d2a-9d83-1b50d1100bb1">
<img width="1440" alt="스크린샷 2023-09-09 오후 1 45 26" src="https://github.com/hachanghyun/springShop2/assets/33058284/f22edd25-2e97-401b-b739-b1c933330ddc">

##### (3). 메인화면에서 상품을 클릭하면 해당 상품정보 페이지가 나오고 장바구니담기와 주문하기 기능이 가능하다.
<img width="1436" alt="스크린샷 2023-09-09 오후 2 02 16" src="https://github.com/hachanghyun/springShop2/assets/33058284/483f7d86-0960-4a94-b581-eaf86cb7857e">

##### (4).상품 등록 페이지에서는 상품 등록 및 이미지를 업로드 할 수 있다.
<img width="1440" alt="스크린샷 2023-09-09 오후 1 45 50" src="https://github.com/hachanghyun/springShop2/assets/33058284/52e95ad9-2411-4f68-82c7-2ab4f95d327f">

##### (5).상품 관리 페이지에서는 등록한 상품ID 및 등록자 정보를 확인 할 수 있다.
<img width="1440" alt="스크린샷 2023-09-09 오후 1 45 58" src="https://github.com/hachanghyun/springShop2/assets/33058284/e44a607f-b7b7-400f-b251-0c46c0a83994">

##### (6).장바구니 페이지에서는 장바구니에 담아둔 상품들을 주문 할 수 있다.
<img width="1440" alt="스크린샷 2023-09-09 오후 1 46 27" src="https://github.com/hachanghyun/springShop2/assets/33058284/881459b8-7e3b-4177-a2a7-aa9370986c96">

##### (7).구매이력 페이지에서는 구매한 상품 목록과 주문 취소 기능이 있다. 
<img width="1440" alt="스크린샷 2023-09-09 오후 1 46 33" src="https://github.com/hachanghyun/springShop2/assets/33058284/c9f9c62a-e108-43a8-bda1-6ce3cd87df00">

## 3. Meaning
	기본 예제를 통해서 Thymeleaf, SprinfData JPA의 기본 사용법을 익히고 스프링 부트위에서 상품, 주문, 장보구니 도메인 로직을 구현해보는 구성입니다. 
 	최신 백엔드 기술을 최대한 접목시켜봤으며 이커머스에 관심이 많았는데 이번기회에 스프링 부트 기술을 이커머스 쇼핑몰으로 구현해봐서 좋은 경험 이었습니다. 
    
## 4. Technology Stacks
    Frontend : thymleaf
    
    Backend : SpringBoot_2.7.1, SpringData JPA, JAVA_11, Gradle
    
    Database : MariaDB

## 5. Develop Environment

### (1).설정값 정리

#### (a).application-{profile}.properties 설정파일
	@Value : 자바코드에서 설정값 사용가능
 	@TestProperty : @TestPropertySource(locations = "classpath:/ApplicationTest.properties") TEST 코드 작성시 H2 데이터베이스로 사용

#### (b).@RestController : @Controller와 @ResponseBody를 합쳐 놓은 어노테이션

    @Controller : 해당 클래스를 요청을 처리하는 컨트롤러로 사용
    
    @ResponseBody : 자바 객체를 HTTP 응당 본문의 객체로 변환해 클라이언트에게 전송

#### (c).Lombok : 반복적인 자바 코드를 컴파일할 때 자동으로 생성해주는 라이브러리

    @Getter @Setter : 접근자/설정자 자동 생성
    
    @NoArgsConstructor : 파라미터가 없는 기본 생성자 생성
    
    @AllArgsConstructor : 모든 필드 값을 파라미터로 받는 생성자 생성
    
    @RequiredArgsConstructor : final, @NonNull인 필드 값만 파라미터로 받는 생성자 생성 
    
    @Tostring : toSting() 메소드 생성

#### (d).Maria DB 설정
    maria db 접속 : mysql -u root -p
    
    show databases; : 현재 데이터베이스 리스트 조회
    
    use 데이터베이스명; : 데이터베이스명 사용
    
    DB 생성 : CREATE DATABASE shop DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

#### (e).테스트 코드 작성
	@SpringBooTest : 통합 테스트를 위해 스프링 부트에서 제공하는 어노테이션, 실제 애플리케이션을 구동할 때처럼 모든 Bean을 IOC 컨테이너에 등록, 애플리케이션 규모가 크면 속도가 느려질 수 있습니다.
 
 	@Autowired : Bean주입 어노테이션
  
  	@Test : 테스트할 메소드 위에 선언하여 해당 메소드를 테스트 대상으로 지정
   
   	@DisplayName(테스트명) : Junit5에 추가된 어노테이션으로 테스트 코드 실행시 @DisplayName에 지정한 테스트명이 노출됩니다.

### (2).JPA 정리

#### (a).JPA 장점 ,단점
    장점
    1. 특정 데이터베이스에 종속되지 않음
    2. 객체지향적 프로그래밍
    3. 생산성 향상
    단점
    1. 복잡한 쿼리 처리 : JPQL, qeurydsl 사용
    2. 성능 저하 위험
    3. 학습시간 

#### (b).querydsl , JPQL 비교
    querydsl 장점
    타입 안정성이 보장됩니다. 단순한 문자열로 쿼리를 생성하는 것이 아니라, 메소드를 기반으로 쿼리를 생성하기 때문에 오타나 존재하지 않는 컬럼명을 명시할 경우 IDE에서 자동으로 검출됩니다. 이 장점은 Jooq에서도 지원하는 장점이지만, Mybatis에서는 지원하지 않습니다.
    
    1. 문자가 아닌 코드로 작성
    
    2. Compile 단계에서 문법 오류를 확인 가능
    
    3. 코드 자동 완성 기능 활용 가능
    
    4. 동적 쿼리 구현 가능

    JPQL 단점
    1. JPQL은 문자열(=String) 형태이기 때문에 개발자 의존적 형태
    
    2. Compile 단계에서 Type-Check가 불가능
    
    3. RunTime 단계에서 오류 발견 가능 (장애 risk 상승)

#### (c).Entity 
    데이터베이스의 테이블에 대응하는 클래스

#### (d).Entity Manager Factory
    엔티티 매니저 인스턴스를 관리하는 주체
    
    애플리케이션 실행 시 한 개만 만들어지며 사용자로부터 요청이 오면 엔티티 매니저 팩토리로부터 엔티티 매니저를 생성합니다.

#### (e).Entity Manager 
    엔티티 매니저란 영속성 컨텍스트에 접근하여 엔티티에 대한 데이터베이스 작업을 제공합니다.
    
    내부적으로 데이터베이스 커넥션을 사용하여 데이터베이스에 접근합니다.
    
    엔티티 매니저의 몇가지 메소드를 살펴보겠습니다. 
    
    find() 메소드 : 영속성 컨텍스트에서 엔티티를 검색하고 영속성 컨텍스트에 없을 경우 데이터베이스에서 데이터를 찾아 영속성 컨텍스트에 저장합니다.
    
    persist() 메소드 : 엔티티를 영속성 컨텍스트에 저장합니다.
    
    remove() 메소드 : 엔티티 클래스를 영속성 컨텍스트에서 삭제합니다.
    
    flush() 메소드 : 영속성 컨텍스트에 저장된 내용을 데이터베이스에 반영합니다.

#### (f).영속성 컨텍스트에 저장후 데이터베이스에 반영하는 코드
    Item item = new Item(); //영속성 컨텍스트와 관련없는 상품 엔티티
    
    item.setItemNm("테스트 상품");
    
    EntityManager em = entityManagerFactory.createEntityManager(); //엔티티매니저 팩토리로부터 엔티티 매니저를 생성
    
    EntityTransaction transaction = em.getTransaction(); // 데이터의 무결성을 위해 반드시 트랜잭션을 시작
    
    transaction.begin();
    
    em.persiste(item); //생성한 상품 엔티티가 영속성 컨텍스트에 저장된 상태, 데이터베이스에 insert sql을 보내지 않은 단계
    
    transaction.commit(); // 트랜잭션을 데이터베이스에 반영, 이때 영속성 컨텍스트에 저장된 상품 정보가 데이터베이스 insert 되면서 반영
    
    em.close(); //사용한 자원을 반환합니다.
    
    emf.close();

#### (g).영속성 컨텍스트 사용 시 이점
    1차캐시 : 영속성 컨텍스트에는 1차 캐시가 존재하며 map으로 저장됩니다. entityManager.find() 메소드 호출시 영속성 컨텍스트의 1차캐시를 조회합니다. 엔티티가 존재할 경우 해당 엔티티를 반환하고 엔티티가 없으면 데이터베이스에서 조회후 1차캐시에 저장 및 반환합니다 
    
    동일성 보장 : 하나의 트랜잭션에서 같은 키값으로 영속성 컨텍스트에 저장된 엔티티 조회 시 같은 엔티티 조회를 보장합니다. 바로 1차 캐시에 저장된 엔티티를 조회하기 때문에 가능합니다.
    
    트랜잭션을 지원하는 쓰기 지연 : 영속성 컨텍스트에는 쓰기지연 SQL저장소가 존재. dentityManager.persist()를 호출하면 1차캐시에 저장되는 것과 동시에 쓰기 지연 SQL 저장소에 SQL문이 저장됨. 이렇게 SQL을 쌓아두고 트랜잭션을 커밋하는 시점에 저장된 SQL문들이 flush되면서 데이터베이스에 반영됨. 이렇게 모아서 보내기 때문에 성능에서 이점을 볼수있음.

#### (h).데이터베이스 초기화 전략 DDL AUTO 옵션
    spring.jpa.hibernate.ddl-auto
    
    none: 사용하지않음 //운영환경 사용
    
    create: 기존 테이블 삭제 후 테이블 생성 //운영환경 사용금지
    
    create-drop: 기존 테이블 삭제 후 테이블 생성, 종료 시점에 테이블 삭제 //운영환경 사용금지
    
    update: 변경된 스키마 적용 //운영환경 사용금지
    
    validate: 엔티티와 테이블 정상 매핑 확인 //운영환경 사용
    
#### (i).Entity 매핑 관련 어노테이션 정리
    @Entity : @Entity 어노테이션은 JPA를 사용해 테이블과 매핑할 클래스에 붙여주는 어노테이션이다. 이 어노테이션을 붙임으로써 JPA가 해당 클래스를 관리하게 된다.	
    
    @Table : @Table은 엔티티와 매핑할 테이블을 지정
    
    @Id: @Id는 특정 속성을 기본키로 설정하는 어노테이션이다.
    
    @Column : @Column은 객체 필드를 테이블 컬럼과 매핑한다.
    
    @Access : @Access는 JPA가 엔티티 데이터에 접근하는 방식을 지정한다.
    
    @Enumerated : @Enumerated는 자바 enum 타입을 매핑할 때 사용한다.
    
    @Temporal : @Temporal은 날짜 타입을 매핑할 때 사용한다
    
    @Lob : @Lob은 일반적인 데이터베이스에서 저장하는 길이인 255개 이상의 문자를 저장하고 싶을 때 지정한다. DB BLOB, CLOB 타입과 매핑 @Lob은 정의할 속성이 따로 없다. 대신 필드 타입이 문자열이면 CLOB, 나머지는 BLOB을 매핑
    
    @Transient: @Transient 어노테이션을 붙인 필드는 DB에 저장하지도 조회하지도 않는다. 객체에 임시로 값을 보관하고 싶을 때 사용
    
    @LastModifiedDate : 조회한 엔티티의 값을 변경할 때 시간 자동 저장

#### (j).Column 속성
    name :필드와 매핑할 테이블의 컬럼 이름을 지정한다.
    
    insertable (거의 사용하지 않음) : 엔티티 저장 시 이 필드도 같이 저장한다. false로 설정하면 이 필드는 데이터베이스에 저장하지 않는다. false 옵션은 읽기 전용일 때 사용한다.
    
    updateable : 엔티티 수정 시 이 필드도 같이 수정한다. false로 설정하면 데이터베이스에 수정하지 않는다. false 옵션은 읽기 전용일 때 사용한다.
    
    table (거의 사용하지 않음) : 하나의 엔티티를 두 개 이상의 테이블에 매필할 때 사용한다.(@SecondaryTable 사용) 지정한 필드를 다른 테이블에 매핑할 수 있다.
    
    nullable (DDL) : DDL 생성 시 null 값의 허용 여부를 설정한다. false로 설정하면 not null 제약조건이 붙는다.
    
    unique (DDL) : @Table의 uniqueConstraints와 같으나 한 컬럼에 간단히 유니크 제약조건을 걸 때 사용한다.
    
    columnDefinition (DDL) : 데이터베이스 컬럼 정보를 직접 줄 수 있다.
    
    length (DDL) : 문자 길이 제약조건, String 타입에만 사용한다.
    
    precision, scale (DDL) : BigDecimal 타입(혹은 BigInteger)에서 사용한다. precision은 소수점을 포함한 전체 자리수를, scale은 소수의 자리수다.

#### (k).기본키를 자동으로 생성하는 방법 4가지
    기본키를 자동으로 생성할 때에는 @Id와 @GenerratedValue 어노테이션이 함께 사용되어야 한다.
    
    1. @GeneratedValue(strategy = GenerationType.IDENTITY) : 기본키 생성을 데이터베이스에게 위임하는 방식으로 id값을 따로 할당하지 않아도 데이터베이스가 자동으로 AUTO_INCREMENT를 하여 기본키를 생성해준다.
    
    2. @GeneratedValue(strategy = GenerationType.SEQUNCE) : 데이터 베이스의 Sequence Object를 사용하여 데이터베이스가 자동으로 기본키를 생성해준다. @SequenceGenerator 어노테이션이 필요하다.
    
    3. @GeneratedValue(strategy = GenerationType.TABLE) : 키를 생성하는 테이블을 사용하는 방법으로 Sequence와 유사하다. @TableGenerator 어노테이션이 필요하다.
    
    4. @GeneratedValue(strategy = GenerationType.AUTO) : 기본 설정 값으로 각 데이터베이스에 따라 기본키를 자동으로 생성한다.
    
    기본키의 제약조건
    (1). null이면 안된다.
    (2). 유일하게 식별할 수 있어야한다.
    (3). 변하지 않는 값이어야 한다.

#### (l).Repository 기본 메소드
	import org.springframework.data.jpa.repository.JpaRepository; 
	
	import domain.Member; 
	
	public interface SampleRepository extends JpaRepository<Member, Integer> {
	
	}
	
	이 인터페이스를 구현한 클래스를 spring JPA가 자동으로 구현한다. 자동으로 구현된 클래스에는 아래와 같은 기본 메서드를 포함한다.
	
	save(member) : Member 객체를 Member 테이블에 저장, 객체의 id(기본키) 속성값이 0이면 INSERT / 0이 아니면 UPDATE
	
	saveAll(memberList) : Member 객체 목록을 Member 테이블에 저장
	
	delete(member) : Member 객체의 id(기본키) 속성값과 일치하는 레코드를 삭제
	
	deleteAll(memberList) : Member 객체 목록을 테이블에서 삭제
	
	count() : Member 테이블의 전체 레코드 수를 리턴
	
	exists(id) : Member 테이블에서 id에 해당하는 레코드가 있는지 true/false를 리턴
	
	flush() : 지금까지 Member 테이블에 대한 데이터 변경 작업들이 디스크에 모두 기록

	쿼리메소드
	findAll() 메소드 : Member 테이블에서 레코드 전체 목록을 조회, List<Member> 객체가 리턴
	
	findById(id) : find + (엔티티 이름) + By + 변수이름, Member 테이블에서 기본키 필드 값이 id인 레코드를 조회 Optional<Member> 타입의 객체가 리턴, 이 객체의 get 메서드를 호출하면 Member 객체가 리턴 예) Member m = memberRepository.findById(id).get();

#### (m). spring DATA JPA @Query 어노테이션 (JPQL)
	JPQL특징 : JPQL은 엔티티 객체를 대상으로 쿼리를 수행, 특정 데이터베이스 SQL에 의존하지 않습니다.
 
 	@Query 를 이용한 조회 : select "엔티티명" = select "*", @Param 을 통해 매개변수로 넘어온 값을 JPQL에 들어갈 변수로 지정
  	public interface MemberRepository extends JpaRepository<Member, Long> {
   
	@Query("select m from Member m where m.username = :username and m.age = :age")
 
	List<Member> findUser(@Param("username") String username, @Param("age") int age);
	}
#### (n). spring DATA JPA Querydsl
	JPAQuery 데이터 반환메소드
 	List<T> fetch() : 조회 결과 리스트 반환

### (3).Front End
	서버템플릿엔진 : JSP, Thymeleaf, Mustache, 서버에서 Java코드로 문자열을 만든뒤 이 문자열을 HTML로 변환하여 브라우저로 전달
 	클라이언트 템플릿 엔진 : React, Vue, 브라우저에서 화면생성, Json, XML 형식의 데이터만 전달하고 클라이언트에서 이를 혼합해 화면을 만든다.

### (4). 스프링 시큐리티
	스프링 시큐리티 추가 : 모든 요청은 인증을 필요로함.
 	스프링 시큐리티 기본적으로 제공하는 아이디 : user, 비밀번호는 애플리케이션을 실행할때마다 콘솔창에 출력해서 보여줌.

### (5). 연관 관계 매핑
	연관 관계를 매핑할 때, 생각해야 할 것은 크게 3가지가 있습니다.
	방향 : 단방향, 양방향 (객체 참조)
 
	연관 관계의 주인 : 양방향일 때, 연관 관계에서 관리 주체
 
	다중성 : 다대일(N:1), 일대다(1:N), 일대일(1:1), 다대다(N:M)

#### (a).단방향, 양방향
	데이터베이스 테이블은 외래 키 하나로 양 쪽 테이블 조인이 가능합니다.
	
	따라서 데이터베이스는 단방향이니 양방향이니 나눌 필요가 없습니다.
	
	그러나 객체는 참조용 필드가 있는 객체만 다른 객체를 참조하는 것이 가능합니다.
	
	그렇기 때문에 두 객체 사이에 하나의 객체만 참조용 필드를 갖고 참조하면 단방향 관계, 두 객체 모두가 각각 참조용 필드를 갖고 참조하면 양방향 관계라고 합니다.
	
	엄밀하게는 양방향 관계↔️는 없고 두 객체가 단방향 참조를 각각 가져서 양방향 관계처럼 사용하고 말하는 것입니다. ⬅ ➡
	
	JPA를 사용하여 데이터베이스와 패러다임을 맞추기 위해서 객체는 단방향 연관 관계를 가질지, 양방향 연관 관계를 가질지 선택해야합니다.
	
	선택은 비즈니스 로직에서 두 객체가 참조가 필요한지 여부를 고민해보면 됩니다.
	
	Board.getPost()처럼 참조가 필요하면 Board→Post 단방향참조
	만약 참조가 굳이 필요없으면 참조를 안하면 됨
	post.getBoard()처럼 참조가 필요하면 Post→Board 단방향참조
	만약 참조가 굳이 필요없으면 참조를 안하면 됨
	이렇게 비즈니스 로직에 맞게 선택했는데 두 객체가 서로 단방향 참조를 했다면 양방향 연관 관계가 되는 것입니다.
	
	단방향 연관 관계와 양방향 연관 관계를 구분하는 방법은 이렇게 이해하면 됩니다.
 
#### (b).무조건 양방향 관계를 하면 쉽지 않나?
 	객체 입장에서 양방향 매핑을 했을 때 오히려 복잡해질 수 있습니다.

	예를 들어 일반적인 비즈니스 애플리케이션에서 사용자(User)엔티티는 굉장히 많은 엔티티와 연관 관계를 갖습니다.
	
	이런 경우에 모든 엔티티를 양방향 관계로 설정하게 되면 사용자(User)엔티티는 엄청나게 많은 테이블과 연관 관계를 맺게 되고 User클래스를 보면 엄청나게 복잡해진 것을 확인할 수 있습니다.
	
	그리고 다른 엔티티들도 불필요한 연관관계 매핑으로 인해 복잡성이 증가할 수 있습니다.
	
	그래서 양방향으로 할지 단방향으로 할지 필히 구분해줘야합니다.
	
	구분하기 좋은 기준은 기본적으로 단방향 매핑으로 하고 나중에 역방향으로 객체 탐색이 꼭 필요하다고 느낄 때 추가하는 것으로 잡으면 됩니다.
	
	그냥 참조만 추가한다고 되는 건 아니고 자세한 것은 아래에서 설명합니다.

#### (c).연관 관계의 주인
  	두 객체(A, B)가 양방향 관계, 다시 말해 단방향 관계 2개(A→B, B→A)를 맺을 때, 연관 관계의 주인을 지정해야 합니다.

	연관 관계의 주인을 지정 하는 것은 두 단방향 관계(A→B, B→A)중, 제어의 권한(외래 키를 비롯한 테이블 레코드를 저장, 수정, 삭제 처리)을 갖는 실질적인 관계가 어떤 것인지 JPA에게 알려준다고 생각하면 됩니다.
	
	연관 관계의 주인은 연관 관계를 갖는 두 객체 사이에서 조회, 저장, 수정, 삭제를 할 수 있지만, 연관 관계의 주인이 아니면 조회만 가능합니다.
	
	연관 관계의 주인이 아닌 객체에서 mappedBy 속성을 사용해서 주인을 지정해줘야합니다.
	
	TIP : 외래 키가 있는 곳을 연관 관계의 주인으로 정하면 됩니다. 무조건. 😄

#### (d).왜 연관 관계의 주인을 지정해야하는가?
   	두 객체 (Board, Post)가 있고 양방향 연관 관계를 갖는다고 생각해봅니다.

	그 상황에서 게시글(Post)의 게시판을 다른 게시판(Board)으로 수정하려고 할 때, Post 객체에서 setBoard(...) 같은 메소드를 이용해서 수정하는게 맞는지, Board객체에서 getPosts() 같은 메소드를 이용해서 List의 게시글을 수정하는게 맞는지 헷갈릴 수 있습니다. 🤔
	
	두 객체 입장에서는 두 방법 다 맞는 방법이긴 합니다.
	
	그러나 이렇게 객체에서 양방향 연관 관계 관리 포인트가 두 개일 때는 테이블과 매핑을 담당하는 JPA입장에서 혼란을 주게 됩니다.
	
	즉, Post에서 Board를 수정할 때 FK(Foreign Key)를 수정할 지, Board에서 Post를 수정할 때 FK(Foreign Key)를 수정할 지를 결정하기 어려운 것입니다.
	
	그렇기 때문에 두 객체 사이의 연관 관계의 주인을 정해서 명확하게 Post에서 Board를 수정할 때만 FK를 수정하겠다! 라고 정하는 것입니다.
  	
#### (e).연관 관계의 주인만 제어하면 되나?
	데이터베이스에 외래 키가 있는 테이블을 수정하려면 연관 관계의 주인만 변경하는 것이 맞는가? 맞습니다.

	맞긴 하지만, 그것은 데이터베이스만 생각했을 때고, 객체를 생각해보면 사실 둘 다 변경해주는 것이 좋습니다. (연관 관계의 주인이 아닌 곳에서도 변경!)
	
	왜냐하면 두 참조를 사용하는 순수한 두 객체는 데이터 동기화를 해줘야하기 때문입니다.

 #### (f).다중성
 	데이터베이스를 기준으로 다중성을 결정합니다.

	(JPA는 JPQL도 그렇고 보통 객체를 기준으로 하는게 일반적인데 다중성을 정하는 기준은 데이터베이스 기준인게 신기합니다.)
	
	연관 관계는 대칭성을 갖습니다.
	일대다 ↔ 다대일
	일대일 ↔ 일대일
	다대다 ↔ 다대다
 
  #### (g).다대일(N:1)
  	게시판(Board)과 게시글(Post)의 관계로 예를 들겠습니다.

	요구 사항
	하나의 게시판(1)에는 여러 게시글(N)을 작성할 수 있습니다.
	하나의 게시글은 하나의 게시판에만 작성할 수 있다.
	게시글과 게시판은 다대일 관계를 갖습니다.
	데이터베이스를 기준으로 다중성(게시글N : 게시판1)을 결정했습니다.
	
	즉, 외래 키를 게시글(N)이 관리하는 일반적인 형태입니다. (참고로 데이터베이스는 무조건 다(N)쪽이 외래 키를 갖습니다.)

 #### (g-1).→ 다대일(N:1) 단방향 코드
 	@Entity
	public class Post {
	    @Id @GeneratedValue
	    @Column(name = "POST_ID")
	    private Long id;
	
	    @Column(name = "TITLE")
	    private String title;
	
	    @ManyToOne
	    @JoinColumn(name = "BOARD_ID")
	    private Board board;
	    //... getter, setter
	}
	
	@Entity
	public class Board {
	    @Id @GeneratedValue
	    private Long id;
	    private String title;
	    //... getter, setter
	}

	다대일 단방향에서는 다 쪽인 Post에서 @ManyToOne 만 추가해준 것을 확인할 수 있습니다.

	반대로 Board에서는 참조하지 않습니다. (단방향이기 때문)

   #### (g-2).→ 다대일(N:1) 양방향 코드
   	@Entity
	public class Post {
	    @Id @GeneratedValue
	    @Column(name = "POST_ID")
	    private Long id;
	
	    @Column(name = "TITLE")
	    private String title;
	
	    @ManyToOne
	    @JoinColumn(name = "BOARD_ID")
	    private Board board;
	    //... getter, setter
	}
	
	@Entity
	public class Board {
	    @Id @GeneratedValue
	    private Long id;
	    private String title;
	
	    @OneToMany(mappedBy = "board")
	    List<Post> posts = new ArrayList<>();
	    //... getter, setter
	}

 	다대일 양방향으로 만드려면 일(1) 쪽에 @OneToMany 를 추가하고 양방향 매핑을 사용했으니 연관 관계의 주인을 mappedBy 로 지정해줍니다.

	mappedBy로 지정할 때 값은 대상이 되는 변수명을 따라 지정하면 됩니다. 여기서는 Post 객체(대상)의 board라는 이름의 변수이기 때문에 board로 지정했습니다.

  #### (h).일대다(1:N)
  	어? 일대다는 다대일에서 반대 입장인데 정리할 필요가 있나? 생각할 수 있지만 앞서 다대일의 기준은 연관관계의 주인 다(N)쪽에 둔 것이고 이번에 언급할 일대다의 기준은 연관관계의 주인을 일(1)쪽에 둔 것입니다.

	※ 참고로 실무에서는 일대다(1:N) 단방향은 거의 쓰지 않도록 합니다.

   #### (h-1).일대다(1:N) 단방향) 코드 
   	데이터베이스 입장에서는 무조건 다(N)쪽에서 외래키를 관리합니다.
	
	근데 일(1)쪽 객체에서 다(N) 쪽 객체를 조작(생성,수정,삭제)하는 방법입니다.

 	@Entity
	public class Post {
	    @Id @GeneratedValue
	    @Column(name = "POST_ID")
	    private Long id;
	
	    @Column(name = "TITLE")
	    private String title;
	  //... getter, setter
	}
	
	@Entity
	public class Board {
	    @Id @GeneratedValue
	    private Long id;
	    private String title;
	
	    @OneToMany
	    @JoinColumn(name = "POST_ID") //일대다 단방향을 @JoinColumn필수
	    List<Post> posts = new ArrayList<>();
	    //... getter, setter
	}

 	@OneToMany에 mappedBy가 없어집니다. 양방향이 아니기 때문입니다.

	대신 @JoinColumn을 이용해서 조인을 합니다.
	
	실제 사용을 아래와 같이 합니다.

 	//...
	Post post = new Post();
	post.setTitle("가입인사");
	
	entityManager.persist(post); // post 저장
	
	Board board = new Board();
	board.setTitle("자유게시판");
	board.getPosts().add(post);
	
	entityManager.persist(board); // board 저장
	//...

 	위와 같은 시나리오로 동작을 살펴보면, post를 저장할 때는 멀쩡하게 insert 쿼리가 나갑니다.

	그 다음이 문제입니다.
	
	board를 저장할 때는 Board를 insert하는 쿼리가 나간 후에 post를 update하는 쿼리가 나갑니다.
	
	왜냐하면 board.getPosts().add(post); 부분 때문인데요.
	
	Board 엔티티는 Board 테이블에 매핑되기 때문에 Board 테이블에 직접 지정할 수 있으나, Post 테이블의 FK(BOARD_ID)를 저장할 방법이 없기 때문에 조인 및 업데이트 쿼리를 날려야 하는 문제가 있습니다.

#### (h-2).치명적인 단점
	일만 수정한 것 같은데 다른 수정이 생겨 쿼리가 발생하는 것.
	Board를 저장했는데 왜 Post가 수정이 되지? 이런 생각을 하게 만듦.
	업데이트 쿼리 때문에 성능상 이슈는 그렇게 크지는 않음.
	그렇기 때문에 TIP으로 일대다(1:N) 단방향 연관 관계 매핑이 필요한 경우는 그냥 다대일(N:1) 양방향 연관 관계를 매핑해버리는게 추후에 유지보수에 훨씬 수월하기 때문에 이 방식을 채택하는 것을 추천합니다.
	
	그런데 실무에서 사용을 금지하지 않는 이유는 되도록 피하는 게 좋지만, JPA 값 타입을 사용하는 것을 대신하여 사용할 때는 또 유용합니다. = 유용한 경우가 적게 나마 있음.
	
	→ 일대다(1:N) 양방향 (실무 사용 금지 ❌)
	
	일대다 양방향은 공식적으로 존재하는 건 아니라서 생략하겠습니다.
	
	키워드는 @JoinColumn(updatable = false, insertable = false) 이지만, 일대다 양방향을 사용해야할 때는 다대일 양방향 사용하도록 하는게 더 좋습니다.
	
	🌈 결과적으로 일대다(1:N) 단방향, 양방향은 쓰지 말고 차라리 다대일(N:1) 양방향으로 쓰는 것이 맞다라고 단순화하여 결론 내리면 될 것 같습니다.

 #### (i).일대일(1:1)
 	주 테이블에 외래키를 넣을 수도 있고, 대상 테이블에 외래키를 넣을 수도 있습니다.

	※ 일대일(1:1)이기 때문에 테이블 A, B가 있을 때, A가 주 테이블이면 B가 대상 테이블이고, B가 주 테이블이면 A가 대상 테이블입니다.

 #### (i-1). → 일대일(1:1) 단방향 코드
 	외래 키를 주 테이블이 갖고 있다는 의미로 해석하겠습니다. (Post테이블(주 테이블)에서 외래키(FK)인 Attach 테이블(대상 테이블)의 PK를 갖고 있도록)
	
	게시글(Post)에 첨부파일(Attach)을 반드시 1개만 첨부할 수 있다고 가정합니다.

 	@Entity
	public class Post {
	    @Id @GeneratedValue
	    @Column(name = "POST_ID")
	    private Long id;
	
	    @Column(name = "TITLE")
	    private String title;
	    @OneToOne
	    @JoinColumn(name = "ATTACH_ID")
	    private Attach attach;
	    //... getter,setter
	}
	@Entity
	public class Attach {
	    @Id @GeneratedValue
	    @Column(name = "ATTACH_ID")
	    private Long id;
	    private String name;
	  //... getter, setter
	}

 	특별할 게 없습니다.

 #### (i-2).→ 일대일(1:1) 양방향 코드
	단순하게 똑같이 @OneToOne 설정하고 mappedBy 설정만 해서 읽기 전용으로 만들어주면 양방향도 간단하게 됩니다.
	
	@Entity
	public class Attach {
	    @Id @GeneratedValue
	    @Column(name = "ATTACH_ID")
	    private Long id;
	    private String name;
	
	    @OneToOne(mappedBy = "attach")
	    private Post post;
	  //... getter, setter
	}

 	→ 일대일(1:1) 단방향 지원 안함 ❌

	아까 정리했는데 왜 또 나왔냐하면, 이번에는 Post테이블(주 테이블)이 아닌 Attach테이블(대상 테이블)에 외래 키(FK)를 갖고 있을 때를 생각해보려고 합니다.
	
	그러나 이거는 JPA에서는 아예 지원을 하지 않습니다.
	
	→ 일대일(1:1) 양방향
	
	이럴 때는 어차피 양 쪽이 일대일이기 때문에 위에서 정의한 대로 처리하면 됩니다.
	
	그러나 논란의 여지가 있습니다.
	
	외래 키를 Post에서 관리하는 게 좋을 것인지, Attach에서 관리하는 게 좋을 것인지 생각을 해봐야합니다. 즉 테이블에 어디에 둘 것 인지를 생각해야합니다.
	
	테이블은 한 번 생성되면 보통 굳어집니다. 변경이 어렵다는 얘기입니다.
	
	그러나 비즈니스는 언제든 바뀔 수 있습니다.
	
	게시글이 여러 개의 첨부파일을 첨부할 수 있도록 비즈니스가 변경되면 어떨까요?
	
	그러면 다(N)쪽인 Attach테이블에 외래 키가 있는 것이 변경에 유연합니다.
	
	그러면 다(N)가 될 확률이 높은 테이블에 외래 키를 놓는게 무조건 좋을까요?
	
	그건 또 아닙니다.
	
	객체 입장에서 Post쪽(1)에서 외래 키를 갖게되면 Post를 조회할 때마다 이미 Attach의 참조를 갖고 있기 때문에 성능상 이득이 있습니다.
	
	※ 결론
	
	종합적으로 판단하고 결정해야하는데 단순화해서, 보통 일대일이라고 정할 때도 아주 신중하게 정했다고 가정한다면 주 테이블(Post)에 외래 키를 두는 것이 더 낫습니다.
	
	다시 말씀드리지만 논쟁이 있고 의견일 뿐입니다.

 #### (j).다대다(N:N)
 	실무 사용 금지 ❌
	중간 테이블이 숨겨져 있기 때문에 자기도 모르는 복잡한 조인의 쿼리(Query)가 발생하는 경우가 생길 수 있기 때문입니다.
	다대다로 자동생성된 중간테이블은 두 객체의 테이블의 외래 키만 저장되기 때문에 문제가 될 확률이 높습니다. 
 	JPA를 해보면 중간 테이블에 외래 키 외에 다른 정보가 들어가는 경우가 많기 때문에 다대다를 일대다, 
  	다대일로 풀어서 만드는 것(중간 테이블을 Entity로 만드는 것)이 추후 변경에도 유연하게 대처할 수 있습니다.
   
