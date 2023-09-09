## 1. Deployment URL
  https://github.com/hachanghyun/springShop2
  
## 2. Summary
### 주요 기능

## 3. Meaning
	
    
## 4. Technology Stack(s)
    Frontend : thymleaf
    
    Backend : SpringBoot, SpringData JPA
    
    Database : MariaDB

## 5. Environment Setup

#### maria db 접속
    mysql -u root -p

#### DB 생성
    CREATE DATABASE shop DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

### 스프링부트 어노테이션 정리

#### @RestController
    @Controller와 @ResponseBody를 합쳐 놓은 어노테이션.

#### Lombok
    반복적인 자바 코드를 컴파일할 때 자동으로 생성해주는 라이브러리.
    
##### 접근자/설정자 자동 생성
    @Getter
    @Setter

##### 생성자 자동 생성 (Lombok 어노테이션을 통해서 생성자를 자동으로 생성할 수 있습니다.)
    @NoArgsConstructor : 파라미터가 없는 기본 생성자
    @AllArgsConstructor : 모든 필드 값을 파라미터로 받는 생성자
    @RequiredArgsConstructor : final, @NonNull인 필드 값만 파라미터로 받는 생성자

##### ToString 어노테이션
    @ToString
    @ToString 어노테이션 클래스에 붙여주면 자동으로 생성해줍니다. 이와 추가적으로 exclude 속성을 사용하면, 특정 필드를 toString()에서 결과를 제거할 수 있습니다.

#### 롬복 빌드시 추가
    annotationProcessor('org.projectlombok:lombok') // 추가

#### JPA
    조회 : querydsl
    등록, 수정, 삭제 : springDataJPA

##### querydsl 장점
    타입 안정성이 보장됩니다. 단순한 문자열로 쿼리를 생성하는 것이 아니라, 메소드를 기반으로 쿼리를 생성하기 때문에 오타나 존재하지 않는 컬럼명을 명시할 경우 IDE에서 자동으로 검출됩니다. 이 장점은 Jooq에서도 지원하는 장점
    이지만, Mybatis에서는 지원하지 않습니다.

##### JPQL의 문제점
    1. JPQL은 문자열(=String) 형태이기 때문에 개발자 의존적 형태
    2. Compile 단계에서 Type-Check가 불가능
    3. RunTime 단계에서 오류 발견 가능 (장애 risk 상승)

##### query DSL 특징
    1. 문자가 아닌 코드로 작성
    2. Compile 단계에서 문법 오류를 확인 가능
    3. 코드 자동 완성 기능 활용 가능
    4. 동적 쿼리 구현 가능

#### Entity 
    데이터베이스의 테이블에 대응하는 클래스

#### Entity Manager Factory
    엔티티 매니저 인스턴스를 관리하는 주체
    애플리케이션 실행 시 한 개만 만들어지며 사용자로부터 요청이 오면 엔티티 매니저 팩토리로부터 엔티티 매니저를 생성합니다.

#### Entity Manager 
    엔티티 매니저란 영속성 컨텍스트에 접근하여 엔티티에 대한 데이터베이스 작업을 제공합니다.
    내부적으로 데이터베이스 커넥션을 사용하여 데이터베이스에 접근합니다.
    엔티티 매니저의 몇가지 메소드를 살펴보겠습니다. 

##### find() 메소드
    영속성 컨텍스트에서 엔티티를 검색하고 영속성 컨텍스트에 없을 경우 데이터베이스에서 데이터를 찾아 영속성 컨텍스트에 저장합니다.

##### persist() 메소드
    엔티티를 영속성 컨텍스트에 저장합니다.

##### remove() 메소드
    엔티티 클래스를 영속성 컨텍스트에서 삭제합니다.

##### flush() 메소드 
    영속성 컨텍스트에 저장된 내용을 데이터베이스에 반영합니다.


##### 영속성 컨텍스트에 저장후 데이터베이스에 반영하는 코드
    Item item = new Item(); //영속성 컨텍스트와 관련없는 상품 엔티티
    item.setItemNm("테스트 상품");
    
    EntityManager em = entityManagerFactory.createEntityManager(); //엔티티매니저 팩토리로부터 엔티티 매니저를 생성
    
    EntityTransaction transaction = em.getTransaction(); // 데이터의 무결성을 위해 반드시 트랜잭션을 시작
    transaction.begin();
    
    em.persiste(item); //생성한 상품 엔티티가 영속성 컨텍스트에 저장된 상태, 데이터베이스에 insert sql을 보내지 않은 단계
    
    transaction.commit(); // 트랜잭션을 데이터베이스에 반영, 이때 영속성 컨텍스트에 저장된 상품 정보가 데이터베이스 insert 되면서 반영
    
    em.close(); //사용한 자원을 반환합니다.
    emf.close();

##### 영속성 컨텍스트 사용 시 이점

###### 1차캐시
    영속성 컨텍스트에는 1차 캐시가 존재하며 map으로 저장됩니다. entityManager.find() 메소드 호출시 영속성 컨텍스트의 1차캐시를 조회합니다. 
    엔티티가 존재할 경우 해당 엔티티를 반환하고 엔티티가 없으면 데이터베이스에서 조회후 1차캐시에 저장 및 반환합니다 

###### 동일성 보장 
    하나의 트랜잭션에서 같은 키값으로 영속성 컨텍스트에 저장된 엔티티 조회 시 같은 엔티티 조회를 보장합니다. 
    바로 1차 캐시에 저장된 엔티티를 조회하기 때문에 가능합니다.

###### 트랜잭션을 지원하는 쓰기 지연 
    영속성 컨텍스트에는 쓰기지연 SQL저장소가 존재. dentityManager.persist()를 호출하면 1차캐시에 저장되는 것과 동시에 쓰기 지연 SQL 저장소에 SQL문이 저장됨.
    이렇게 SQL을 쌓아두고 트랜잭션을 커밋하는 시점에 저장된 SQL문들이 flush되면서 데이터베이스에 반영됨.
    이렇게 모아서 보내기 때문에 성능에서 이점을 볼수있음.

##### 데이터베이스 초기화 전략 DDL AUTO 옵션
    spring.jpa.hibernate.ddl-auto
    none: 사용하지않음 //운영환경 사용
    create: 기존 테이블 삭제 후 테이블 생성 //운영환경 사용금지
    create-drop: 기존 테이블 삭제 후 테이블 생성, 종료 시점에 테이블 삭제 //운영환경 사용금지
    update: 변경된 스키마 적용 //운영환경 사용금지
    validate: 엔티티와 테이블 정상 매핑 확인 //운영환경 사용

##### 쿼리메소드
    find + (엔티티 이름) + By + 변수이름
    엔티티 이름은 생략가능

##### 스프링부트3 querydsl 적용
    build.gradle
    //querydsl 추가
	implementation 'com.querydsl:querydsl-jpa:5.0.0:jakarta'
	annotationProcessor "com.querydsl:querydsl-apt:${dependencyManagement.importedProperties['querydsl.version']}:jakarta"
	annotationProcessor "jakarta.annotation:jakarta.annotation-api"
	annotationProcessor "jakarta.persistence:jakarta.persistence-api"

