//package www.xxx.videos;
//
//@Entity
//public class Animal {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String nome;
//    private Integer idade;
//    private Long usuarioId;
//    // ...
//}
//
//public interface AnimalRepository extends JpaRepository<Animal, Long> {
//}
//
//@RestController
//public class AnimalController {
//
//    @Autowired
//    private AnimalRepository animalRepository;
//
//    @GetMapping("/animais")
//    public List<Animal> buscarAnimais(@AuthenticationPrincipal Usuario usuario) {
//        return animalRepository.findAll();
//    }
//
//    @GetMapping("/animais/{id}")
//    public Animal buscarAnimal(@PathVariable Long id) {
//        return animalRepository.findById(id).orElseThrow(() -> new NotFoundException());
//    }
//}
//
//public class AnimalSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                .antMatchers("/animais/{id}")
//                .access("@securityExpressionRoot.hasUserId(authentication, #id)")
//                .and()
//                .formLogin();
//    }
//}
//
//@EnableWebSecurity
//public class WebSecurityConfiguration extends SpringBootWebSecurityConfiguration {
//
//    @Autowired
//    private AnimalSecurityConfig animalSecurityConfig;
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        super.configure(http);
//        http.addFilterBefore(animalSecurityConfig, UsernamePasswordAuthenticationFilter.class);
//    }
//}
