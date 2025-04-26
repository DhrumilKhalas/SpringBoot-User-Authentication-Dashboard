// Function to display item details in the modal
function showItemDetails(element) {
    // Get the data attributes from the clicked element (link)
    var name = element.getAttribute("data-name");
    var description = element.getAttribute("data-description");
    var image = element.getAttribute("data-image");
    var price = element.getAttribute("data-price");
    var category = element.getAttribute("data-category");
    var stock = element.getAttribute("data-stock");
    var rating = element.getAttribute("data-rating");

    // Set the retrieved data to the modal elements
    document.getElementById("itemName").textContent = name; // Set item name
    document.getElementById("itemDescription").textContent = description; // Set item description
    document.getElementById("itemImage").src = image; // Set item image
    document.getElementById("itemPrice").textContent = "$" + price; // Set item price
    document.getElementById("itemCategory").textContent = category; // Set item category
    document.getElementById("itemStock").textContent = stock; // Set item stock status
    document.getElementById("itemRating").textContent = rating; // Set item rating

    // Display the modal by changing its style
    document.getElementById("itemDetailsModal").style.display = "block";
}

// Function to close the modal
function closeModal() {
    // Hide the modal by setting display to 'none'
    document.getElementById("itemDetailsModal").style.display = "none";
}
