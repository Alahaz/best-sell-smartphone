package com.ziesapp.bestsellsmartphone2020

object ObjekSmartphone {
    private val namaSmartphone = arrayOf(
        "Samsung Galaxy S20/S20 Plus",
        "iPhone 11",
        "Samsung Galaxy Note 10",
        "iPhone 11 Pro/Max",
        "OnePlus 8 Pro",
        "iPhone SE 2020",
        "Samsung Galaxy S20 Ultra",
        "Samsung Galaxy S10 Plus",
        "OnePlus 7 Pro",
        "Google Pixel 4 XL"
    )
    private val detailSmartphone = arrayOf(
        "Its the value-for-money that allows Samsung to win over Apple. The S20 Plus starts at \$1,199 and the S20 starts at \$999. The Infinity-O AMOLED displays on both phones - 6.2 inches for the S20, 6.7 inches for the S20 Plus - are gorgeous. The S20 packs a 4,000mAh battery, while the S20 Plus has 4,500mAh of capacity. The S20 and S20 Plus have truly spectacular cameras. No, not their 12MP main shooters, which are fine – it's the 64MP telephoto that really shines with a 3x optical zoom (up from the usual 2x zoom).",
        "iPhone 11 is the best iPhone for most people simply because it costs \$699. The 6.1-inch screen fits in between the iPhone 11 Pro and 11 Pro Max sizes. This iPhone can delivery all-day battery life, and it's slightly better than the iPhone XR battery. This is close to the best iPhone camera, with both a 12MP main camera and a new 12MP ultra-wide camera to cram more into the frame.",
        "The Note 10 Plus is impressive and certainly impressively big. It's immersive and easy to ignore the small front-facing camera hole at the center-top of the screen. The Note 10 Plus has a 4,300mAh battery, and we found that it goes a day and a half with normal use without a problem. This is where the Note 10 Plus shines, even if it isn't the best camera phone – it's the camera we had the most fun playing with.",
        "The iPhone 11 Pro Max is Apple's biggest and most powerful smartphone to date, and it's also the company's most expensive. Apple's 6.5-inch OLED screen on the iPhone 11 Pro Max really grabbed our attention. This is some of the best battery life we've ever experienced on an iPhone. The triple camera setup on the iPhone 11 Pro Max is fantastic.",
        "You're getting 5G, a 120Hz screen refresh rate, a great camera with 3x optical zoom, and super fast wireless charging. This 6.78-inch has the ability to impress you more than an iPhone for one simple reason: the 'Fluid Display' that sets the refresh rate to 120Hz. Its 4,510 battery capacity isn't the biggest next to what Samsung's phones are touting, but when setting the resolution to FullHD+, we did get by on a single charge very easily. Its quad-lens array on the back of the phone allows for fine 48MP photos and a 3x optical zoom along with a 30x digital zoom.",
        "This isn't Apple's most powerful iPhone, but it's the best value for people who want to stick with iOS 13. This new iPhone SE has a 4.7-inch screen borrowed from the iPhone 7 and iPhone 8. As long as you aren't a power user (who would likely opt for the iPhone 11 series anyway), then you'll be OK with what Apple offers in terms of battery life. For the money, the iPhone SE 2020 takes perfectly fine photos in good light.",
        "The S20 Ultra is truly cutting-edge, with a 100x 'Space Zoom' and, yes 5G, capabilities compatible with both mmWave and sub-6 networks. The 6.9-inch Infinity-O AMOLED screen is the sharpest we've seen, coming in at a whopping 3200 x 1440 resolution (WQHD+) given the model's slim bezels and the narrowest punch-hole we've ever seen. Battery should last you a day or more, though we still haven't hit the two-day battery life threshold yet. The massive 108MP main shooter allows you to crop into photos after the fact without as much distortion.",
        "The S10 Plus is a year older than our top pick, but now an even better value than when it launched at full price in March 2019. The 6.4-inch Super AMOLED display on the S10 Plus is gorgeous, but that's not surprising. The S10 Plus' 4,100mAh battery still pretty large, just nudging past the Note 9's 4,000mAh and far beyond the 3,500mAh one in the Galaxy S9 Plus. The S10 and S10 Plus have the same three cameras on the back: a 12MP regular lens, a 12MP optically zoomed telephoto lens, and a new 16MP ultra-wide lens.",
        "The OnePlus 7 Pro has the wow factor missing from phones thanks to what's on the screen (90Hz fluidity) and what's not (a camera notch). Thanks to a mechanical pop-up selfie camera, the OnePlus 7 Pro has the best screen we've tested. The OnePlus 7 has fairly good, but not great battery life thanks to its 4,000mAh battery.  The camera has always been the weakest part of the OnePlus lineup, but we've experienced better phones from the OnePlus 7 Pro.",
        "The Pixel 4 XL is powerful and its camera capability is still great, but the loss of the rear fingerprint sensor and middling new features. The Pixel 4 XL has the same 6.3-inch screen as the Pixel 3 XL, though it's been stretched to a 19:9 aspect ratio and its refresh rate has been upped to 90Hz for smoother app browsing and gaming. While the 3,700mAh capacity sounds like a lot, we found the battery lasted less than a day with even moderate use. The Pixel 4 XL’s cameras are its best selling point."
    )
    private val gambarSmartphone = intArrayOf(
        R.drawable.img_s20,
        R.drawable.img_iphone11,
        R.drawable.img_note10,
        R.drawable.img_iphone11pro,
        R.drawable.img_oneplus8pro,
        R.drawable.img_iphonese,
        R.drawable.img_s20ultra,
        R.drawable.img_s10,
        R.drawable.img_oneplus7pro,
        R.drawable.img_pixel4xl
    )
    val listData: ArrayList<Smartphone>
        get() {
            val list = arrayListOf<Smartphone>()
            for (position in namaSmartphone.indices) {
                val smartphone = Smartphone()
                smartphone.nama = namaSmartphone[position]
                smartphone.detail = detailSmartphone[position]
                smartphone.foto = gambarSmartphone[position]
                list.add(smartphone)
            }
            return list
        }


}