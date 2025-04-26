package com.example.assignment_two.controller;

import com.example.assignment_two.model.Item;
import com.example.assignment_two.model.User;
import com.example.assignment_two.model.LoginRequest;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    // Show the login page
    @GetMapping("/login")
    public String showLoginPage(Model model) {
        model.addAttribute("loginRequest", new LoginRequest());
        return "login";
    }

    // Handle login form submission
    @PostMapping("/login")
    public String handleLogin(@Valid LoginRequest loginRequest, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "login"; // Return to login page if there are validation errors
        }
        return "redirect:/dashboard"; // Redirect to dashboard if login is successful
    }

    // Show the signup page
    @GetMapping("/signup")
    public String showSignupPage(Model model) {
        model.addAttribute("user", new User());
        return "signup";
    }

    // Handle signup form submission
    @PostMapping("/signup")
    public String handleSignup(@Valid User user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "signup"; // Return to signup page if there are validation errors
        }
        return "redirect:/login"; // Redirect to login page after successful signup
    }

    // Show the dashboard with a list of items
    @GetMapping("/dashboard")
    public String showDashboard(Model model) {

        // Create a list of items to display
        List<Item> items = new ArrayList<>();

        // Add items to the list
        items.add(new Item("Toy", "A fun toy", "/details/toy", "/images/toy.jpg", 15.99,
                "This lovable teddy bear family includes the father, mother, and two children, each with their own unique features and personalities. The family is designed to bring warmth and joy to anyone who meets them. Whether you're looking for a gift for a child or simply a cute addition to your collection, this soft and cuddly set is perfect for all ages. Made from high-quality, plush fabric, the teddy bear family will quickly become a cherished companion, offering comfort and companionship whenever you need it.",
                "Toys", "In Stock", 4.5));

        items.add(new Item("Puzzle", "A challenging puzzle", "/details/puzzle", "/images/puzzle.jpg", 12.99,
                "A challenging puzzle game that’s perfect for individuals and families. This puzzle includes a variety of intricate pieces that engage your mind and require patience to complete. Ideal for anyone who enjoys testing their problem-solving abilities, the puzzle offers hours of entertainment while helping to improve cognitive skills. Whether you’re solving it alone or with friends, it’s a great way to bond and enjoy quality time. With its vivid imagery and rewarding complexity, this puzzle is a must-have for puzzle enthusiasts.",
                "Games", "In Stock", 4.2));

        items.add(new Item("Wrist Watch", "Elegant men’s wristwatch", "/details/watch",
                "/images/watch.jpg", 149.99,
                "The Men's Luxury Wrist Watch combines timeless elegance with modern sophistication. Crafted from high-quality stainless steel, this watch features a sleek, minimalist design with a polished finish. The watch face is clear and easy to read, with precision quartz movement ensuring accurate timekeeping. With its durable build and premium leather strap, it's designed to complement any outfit—whether you're heading to the office or attending a formal event. The watch is water-resistant, offering both style and practicality. Ideal for those who appreciate refined craftsmanship, this watch is a must-have accessory for any man.",
                "Accessories", "In Stock", 4.8));

        items.add(new Item("Smartphone", "Latest model with stunning features", "/details/smartphone",
                "/images/phone.png", 599.99,
                "The latest model smartphone packed with incredible features, including 5G connectivity, an advanced camera system, and a sleek, modern design. Whether you’re working, gaming, or capturing memories, this smartphone offers an impressive performance that meets all your needs. It boasts a high-resolution screen, fast processing power, and a long-lasting battery life, ensuring you stay connected and productive throughout the day. With its elegant look and cutting-edge technology, it’s perfect for anyone looking to upgrade their mobile experience.",
                "Electronics", "In Stock (50 units)", 4.7));

        items.add(new Item("Laptop", "High performance laptop", "/details/laptop", "/images/laptop.png",
                899.99,
                "A powerful laptop designed for both professionals and gamers, offering a seamless performance experience. Equipped with fast processors, advanced graphics, and an ultra-responsive keyboard, this laptop can handle anything from complex business tasks to high-end gaming. It features a stunning high-definition display, providing clear visuals whether you’re working or relaxing. Lightweight and durable, this laptop is built for those who need performance and portability without compromise, making it the perfect tool for productivity, entertainment, and creativity.",
                "Electronics", "Out of Stock", 4.6));

        // Add the list of items to the model to be accessed in the view
        model.addAttribute("items", items);
        return "dashboard"; // Return the dashboard page
    }

}
