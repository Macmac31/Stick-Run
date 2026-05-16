// RankingDataGenerator.java
// Subsystem A: Provides ranking data for your website

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class RankingDataGenerator {
    
    public static void main(String[] args) {
        System.out.println("📊 SUBSYSTEM A: RANKING DATA PROVIDER");
        System.out.println("Generating ranking data for Stick Run Classic...");
        
        // Generate JSON for rankings
        String json = generateRankingJSON();
        
        // Save to file
        String filename = "rankings_data.json";
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            writer.print(json);
            System.out.println("✅ Ranking data saved to: " + filename);
            System.out.println("\n📄 JSON Preview:");
            System.out.println(json.substring(0, 300) + "...");
        } catch (IOException e) {
            System.err.println("❌ Error: " + e.getMessage());
        }
        
        System.out.println("\n📌 NEXT: Copy rankings_data.json to your website folder");
        System.out.println("📌 THEN: Modify your website to load this data");
    }
    
    private static String generateRankingJSON() {
        return """
        {
          "generated": "2026-03-08",
          "lastUpdated": "Today",
          "totalPlayers": 635,
          "categories": {
            "active": [
              {"rank": 1, "name": "nibbler", "score": "553 min", "badge": "Ultra Active"},
              {"rank": 2, "name": "Killerwbøss", "score": "277 min", "badge": "Very Active"},
              {"rank": 3, "name": "blzmes", "score": "259 min", "badge": "Very Active"},
              {"rank": 4, "name": "Macmac Cosme", "score": "230 min", "badge": "Active"},
              {"rank": 5, "name": "Hibandicam", "score": "208 min", "badge": "Active"}
            ],
            "highscore": [
              {"rank": 1, "name": "cpmpastrana", "score": "24,271", "badge": "Legend"},
              {"rank": 2, "name": "Lancho", "score": "24,121", "badge": "Legend"},
              {"rank": 3, "name": "Palfittzk", "score": "22,074", "badge": "Pro"},
              {"rank": 4, "name": "dehislime", "score": "18,908", "badge": "Pro"},
              {"rank": 5, "name": "Coneno", "score": "17,068", "badge": "Pro"}
            ],
            "boxjumps": [
              {"rank": 1, "name": "Coneno", "score": "1st Place", "badge": "Jump God"},
              {"rank": 2, "name": "Palfitt2k", "score": "2nd Place", "badge": "Jump Pro"},
              {"rank": 3, "name": "Damman1234", "score": "3rd Place", "badge": "Jump Pro"},
              {"rank": 4, "name": "eprowy", "score": "4th Place", "badge": "Jump Expert"},
              {"rank": 5, "name": "stickrunner", "score": "5th Place", "badge": "Jump Expert"}
            ]
          }
        }
        """;
    }
}