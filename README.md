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
	기본 예제를 통해서 Thymeleaf, SprinfData JPA의 기본 사용법을 익히고 스프링 부트위에서 상품, 주문, 장보구니 도메인 로직을
 	구현해보는 구성입니다. 최신 백엔드 기술을 최대한 다 접목시켜봤으며 이커머스에 관심이 많았는데 이번기회에 스프링 부트 기술을 이커머스시스템으로
  	구현해봐서 좋은 경험 이었습니다. 
    
## 4. Technology Stacks
    Frontend : thymleaf
    
    Backend : SpringBoot_2.7.15, SpringData JPA, JAVA_11, Gradle
    
    Database : MariaDB

## 5. Develop Environment

### (1).설정값 정리

#### (a).application-{profile}.properties 설정파일
	@Value : 자바코드에서 설정값 사용가능

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

 	findAll() 메소드 : Member 테이블에서 레코드 전체 목록을 조회, List<Member> 객체가 리턴
  
        findById(id) : Member 테이블에서 기본키 필드 값이 id인 레코드를 조회 Optional<Member> 타입의 객체가 리턴, 이 객체의 get 메서드를 호출하면 Member 객체가 리턴 예) Member m = memberRepository.findById(id).get();

 	save(member) : Member 객체를 Member 테이블에 저장, 객체의 id(기본키) 속성값이 0이면 INSERT / 0이 아니면 UPDATE

	saveAll(memberList) : Member 객체 목록을 Member 테이블에 저장

 	delete(member) : Member 객체의 id(기본키) 속성값과 일치하는 레코드를 삭제

 	deleteAll(memberList) : Member 객체 목록을 테이블에서 삭제

 	count() : Member 테이블의 전체 레코드 수를 리턴

	exists(id) : Member 테이블에서 id에 해당하는 레코드가 있는지 true/false를 리턴

 	flush() : 지금까지 Member 테이블에 대한 데이터 변경 작업들이 디스크에 모두 기록
 	
##### 쿼리메소드
    find + (엔티티 이름) + By + 변수이름
    엔티티 이름은 생략가능

