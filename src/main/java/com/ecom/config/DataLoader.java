package com.ecom.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.ecom.model.Category;
import com.ecom.model.Product;
import com.ecom.model.UserDtls;
import com.ecom.repository.CategoryRepository;
import com.ecom.repository.ProductRepository;
import com.ecom.repository.UserRepository;

@Component
public class DataLoader implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public void run(String... args) throws Exception {
		// Check if data already exists
		loadCategories();
		loadProducts();
		loadUsers();
		System.out.println("✓ Dummy data RELOADED successfully!");

	}

	private void loadCategories() {
		// Clear existing
		categoryRepository.deleteAll();
		
		// Category 1: Electronics (match DB)
		Category electronics = new Category();
		electronics.setName("Electronics");
		electronics.setImageName("laptop.jpg");
		electronics.setIsActive(true);
		categoryRepository.save(electronics);

		// Category 2: Clothing
		Category clothing = new Category();
		clothing.setName("Clothing");
		clothing.setImageName("pant.png");
		clothing.setIsActive(true);
		categoryRepository.save(clothing);

		// Category 3: Books
		Category books = new Category();
		books.setName("Books");
		books.setImageName("book.jpg");
		books.setIsActive(true);
		categoryRepository.save(books);

		// Category 4: Furniture
		Category furniture = new Category();
		furniture.setName("Furniture");
		furniture.setImageName("monitor.jpg");
		furniture.setIsActive(true);
		categoryRepository.save(furniture);
	}

	private void loadProducts() {
		// Product 1: iPhone 14
		Product product1 = new Product();
		product1.setTitle("iPhone 14 Pro");
		product1.setDescription("Latest Apple iPhone with A16 Bionic chip, 6GB RAM, 128GB Storage");
		product1.setCategory("Electronics");
		product1.setPrice(999.99);
		product1.setStock(50);
		product1.setImage("iphone 14.jpg");
		product1.setDiscount(10);
		product1.setDiscountPrice(899.99);
		product1.setIsActive(true);
		productRepository.save(product1);

		// Product 2: HP Laptop
		Product product2 = new Product();
		product2.setTitle("HP Laptop 15");
		product2.setDescription("Intel i5 11th Gen, 8GB RAM, 512GB SSD, Windows 11");
		product2.setCategory("Electronics");
		product2.setPrice(649.99);
		product2.setStock(30);
		product2.setImage("hp laptop.jpg");
		product2.setDiscount(15);
		product2.setDiscountPrice(552.49);
		product2.setIsActive(true);
		productRepository.save(product2);

		// Product 3: Blue Shirt
		Product product3 = new Product();
		product3.setTitle("Premium Blue Shirt");
		product3.setDescription("100% Cotton, Comfortable fit, Available in all sizes");
		product3.setCategory("Fashion");
		product3.setPrice(29.99);
		product3.setStock(100);
		product3.setImage("blue shirt.jfif");
		product3.setDiscount(20);
		product3.setDiscountPrice(23.99);
		product3.setIsActive(true);
		productRepository.save(product3);

		// Product 4: Blue Jeans
		Product product4 = new Product();
		product4.setTitle("Classic Blue Jeans");
		product4.setDescription("Slim fit denim, stretchable material, perfect for casual wear");
		product4.setCategory("Fashion");
		product4.setPrice(49.99);
		product4.setStock(80);
		product4.setImage("jeans blue.jfif");
		product4.setDiscount(15);
		product4.setDiscountPrice(42.49);
		product4.setIsActive(true);
		productRepository.save(product4);

		// Product 5: Canvas Shoes
		Product product5 = new Product();
		product5.setTitle("Canvas Casual Shoes");
		product5.setDescription("Comfortable canvas shoes, lightweight and durable");
		product5.setCategory("Fashion");
		product5.setPrice(39.99);
		product5.setStock(75);
		product5.setImage("canvas.jfif");
		product5.setDiscount(10);
		product5.setDiscountPrice(35.99);
		product5.setIsActive(true);
		productRepository.save(product5);

		// Product 6: Loafer Shoes
		Product product6 = new Product();
		product6.setTitle("Premium Loafer Shoes");
		product6.setDescription("Formal loafer shoes, perfect for office and casual wear");
		product6.setCategory("Fashion");
		product6.setPrice(79.99);
		product6.setStock(60);
		product6.setImage("lofer.jfif");
		product6.setDiscount(12);
		product6.setDiscountPrice(70.39);
		product6.setIsActive(true);
		productRepository.save(product6);

		// Product 7: Lehenga
		Product product7 = new Product();
		product7.setTitle("Traditional Lehenga");
		product7.setDescription("Beautiful ethnic lehenga, perfect for festivals and celebrations");
		product7.setCategory("Fashion");
		product7.setPrice(149.99);
		product7.setStock(40);
		product7.setImage("lehenga.jfif");
		product7.setDiscount(20);
		product7.setDiscountPrice(119.99);
		product7.setIsActive(true);
		productRepository.save(product7);

		// Product 8: Kurta
		Product product8 = new Product();
		product8.setTitle("Ethnic Kurta");
		product8.setDescription("Traditional ethnic kurta, comfortable and stylish");
		product8.setCategory("Fashion");
		product8.setPrice(59.99);
		product8.setStock(90);
		product8.setImage("kruti.jfif");
		product8.setDiscount(18);
		product8.setDiscountPrice(49.19);
		product8.setIsActive(true);
		productRepository.save(product8);

		// Product 9: Fridge
		Product product9 = new Product();
		product9.setTitle("Double Door Refrigerator");
		product9.setDescription("350L capacity, frost-free technology, energy efficient");
		product9.setCategory("Home & Kitchen");
		product9.setPrice(599.99);
		product9.setStock(25);
		product9.setImage("fridge.png");
		product9.setDiscount(8);
		product9.setDiscountPrice(551.99);
		product9.setIsActive(true);
		productRepository.save(product9);

		// Product 10: Grinder
		Product product10 = new Product();
		product10.setTitle("Kitchen Mixer Grinder");
		product10.setDescription("1000W power, 3 jars, perfect for kitchen grinding");
		product10.setCategory("Home & Kitchen");
		product10.setPrice(89.99);
		product10.setStock(100);
		product10.setImage("grinder.jpg");
		product10.setDiscount(22);
		product10.setDiscountPrice(70.19);
		product10.setIsActive(true);
		productRepository.save(product10);

		// Product 11: Laptop (Generic)
		Product product11 = new Product();
		product11.setTitle("Dell XPS 13 Laptop");
		product11.setDescription("Intel i7, 16GB RAM, 512GB SSD, 13-inch display");
		product11.setCategory("Electronics");
		product11.setPrice(1199.99);
		product11.setStock(20);
		product11.setImage("laptop.jpg");
		product11.setDiscount(5);
		product11.setDiscountPrice(1139.99);
		product11.setIsActive(true);
		productRepository.save(product11);

		// Product 12: Cross Pendant
		Product product12 = new Product();
		product12.setTitle("Cross Pendant Necklace");
		product12.setDescription("Stainless steel cross pendant with chain");
		product12.setCategory("Fashion");
		product12.setPrice(24.99);
		product12.setStock(150);
		product12.setImage("cross.jfif");
		product12.setDiscount(15);
		product12.setDiscountPrice(21.24);
		product12.setIsActive(true);
		productRepository.save(product12);
	}

	private void loadUsers() {
		// Clear existing users except original admin
		userRepository.deleteAll();
		
		// Keep original admin (uncommented for your DB)
		// UserDtls originalAdmin = new UserDtls();
		// ... your existing vamsi user ...

		// Test Admin
		UserDtls admin = new UserDtls();
		admin.setName("Test Admin");
		admin.setEmail("testadmin@ecom.com");
		admin.setMobileNumber("9999999999");
		admin.setPassword(passwordEncoder.encode("admin123"));
		admin.setAddress("Test Street");
		admin.setCity("Test City");
		admin.setState("Test State");
		admin.setPincode("123456");
		admin.setRole("ROLE_ADMIN");
		admin.setIsEnable(true);
		admin.setAccountNonLocked(true);
		admin.setFailedAttempt(0);
		admin.setProfileImage("ecom.png");
		userRepository.save(admin);

		// Test Users
		UserDtls user1 = new UserDtls();
		user1.setName("Test User1");
		user1.setEmail("user1@ecom.com");
		user1.setMobileNumber("8888888881");
		user1.setPassword(passwordEncoder.encode("user123"));
		user1.setAddress("User1 Addr");
		user1.setCity("City1");
		user1.setState("State1");
		user1.setPincode("111111");
		user1.setRole("ROLE_USER");
		user1.setIsEnable(true);
		user1.setAccountNonLocked(true);
		user1.setFailedAttempt(0);
		user1.setProfileImage("ecom.png");
		userRepository.save(user1);

		UserDtls user2 = new UserDtls();
		user2.setName("Test User2");
		user2.setEmail("user2@ecom.com");
		user2.setMobileNumber("8888888882");
		user2.setPassword(passwordEncoder.encode("user456"));
		user2.setAddress("User2 Addr");
		user2.setCity("City2");
		user2.setState("State2");
		user2.setPincode("222222");
		user2.setRole("ROLE_USER");
		user2.setIsEnable(true);
		user2.setAccountNonLocked(true);
		user2.setFailedAttempt(0);
		user2.setProfileImage("ecom.png");
		userRepository.save(user2);
	}

}
