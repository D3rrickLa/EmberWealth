Author: D3rrick La

Version: 0.0.1


## Summary
FIREFinance (PLACEHOLDER - name to be determine) is a social platform for anyone who wants to take their finances to the next level. Whether you are a beginner or an expert about all things finance, this platform is here for you to share your journey to financial freedom.
The application is targetted towards 18 - 45 year olds, as based on own observations, that is the age range where people will tend to care about/know about FIRE. The application was born out of my desire to track my finances and have a centralized place
where I can see where is my money flowing, along with tracking my goals and if I am on target. Currently, there isn't a unified/easy way for people to track their finances, often relying on spreadsheets or clunking software with subscription models.

This project will combine both the tracking of your finance with the social aspect of today's world. We will have a dedicated forms/post feature where uses can post their stories about their journey towards finance independence. The following document is a representation of how the project is being built, why we did it in such a way, and a reference point if we are getting off track.



## System Block Diagram
![image](https://github.com/user-attachments/assets/8543aa8a-73fa-4206-bef5-e84f1cb4d9d9)


*again, AI this thing, I know this is wrong, but it has the concept there
    <svg viewBox="0 0 1600 1200" xmlns="http://www.w3.org/2000/svg">
      
      <!-- Title -->
      <text x="800" y="30" text-anchor="middle" font-weight="bold" font-size="20" fill="#1976d2">Personal Finance Platform - System Block Diagram</text>
      
      <!-- Client Layer -->
      <g id="client-layer">
        <rect x="50" y="80" width="1500" height="120" fill="#e3f2fd" stroke="#1976d2" stroke-width="2" rx="10"/>
        <text x="800" y="100" text-anchor="middle" font-weight="bold" font-size="16" fill="#1976d2">CLIENT LAYER</text>
        
        <!-- Web App -->
        <rect x="100" y="120" width="200" height="60" fill="#bbdefb" stroke="#1976d2" stroke-width="1" rx="5"/>
        <text x="200" y="140" text-anchor="middle" font-weight="bold" font-size="12">Web Application</text>
        <text x="200" y="155" text-anchor="middle" font-size="10">React/Vue/Angular</text>
        <text x="200" y="170" text-anchor="middle" font-size="10">Portfolio Dashboard</text>
        
        <!-- Mobile App -->
        <rect x="350" y="120" width="200" height="60" fill="#bbdefb" stroke="#1976d2" stroke-width="1" rx="5"/>
        <text x="450" y="140" text-anchor="middle" font-weight="bold" font-size="12">Mobile Application</text>
        <text x="450" y="155" text-anchor="middle" font-size="10">iOS/Android</text>
        <text x="450" y="170" text-anchor="middle" font-size="10">Portfolio Tracking</text>
        
        <!-- Admin Panel -->
        <rect x="600" y="120" width="200" height="60" fill="#bbdefb" stroke="#1976d2" stroke-width="1" rx="5"/>
        <text x="700" y="140" text-anchor="middle" font-weight="bold" font-size="12">Admin Panel</text>
        <text x="700" y="155" text-anchor="middle" font-size="10">Content Moderation</text>
        <text x="700" y="170" text-anchor="middle" font-size="10">User Management</text>
      </g>
      
      <!-- API Gateway -->
      <g id="api-gateway">
        <rect x="600" y="250" width="400" height="80" fill="#fff3e0" stroke="#f57c00" stroke-width="2" rx="10"/>
        <text x="800" y="275" text-anchor="middle" font-weight="bold" font-size="16" fill="#f57c00">API GATEWAY</text>
        <text x="800" y="295" text-anchor="middle" font-size="12">Rate Limiting • Authentication • Routing</text>
        <text x="800" y="310" text-anchor="middle" font-size="12">Load Balancing • Request/Response Logging</text>
      </g>
      
      <!-- Application Layer -->
      <g id="app-layer">
        <rect x="50" y="380" width="1500" height="200" fill="#e8f5e8" stroke="#388e3c" stroke-width="2" rx="10"/>
        <text x="800" y="400" text-anchor="middle" font-weight="bold" font-size="16" fill="#388e3c">APPLICATION LAYER (Backend Services)</text>
        
        <!-- User Service -->
        <rect x="100" y="420" width="180" height="100" fill="#c8e6c9" stroke="#388e3c" stroke-width="1" rx="5"/>
        <text x="190" y="440" text-anchor="middle" font-weight="bold" font-size="12">User Service</text>
        <text x="190" y="455" text-anchor="middle" font-size="10">• Authentication</text>
        <text x="190" y="470" text-anchor="middle" font-size="10">• User Profiles</text>
        <text x="190" y="485" text-anchor="middle" font-size="10">• Following System</text>
        <text x="190" y="500" text-anchor="middle" font-size="10">• Settings</text>
        
        <!-- Portfolio Service -->
        <rect x="320" y="420" width="180" height="100" fill="#c8e6c9" stroke="#388e3c" stroke-width="1" rx="5"/>
        <text x="410" y="440" text-anchor="middle" font-weight="bold" font-size="12">Portfolio Service</text>
        <text x="410" y="455" text-anchor="middle" font-size="10">• Portfolio CRUD</text>
        <text x="410" y="470" text-anchor="middle" font-size="10">• Asset Management</text>
        <text x="410" y="485" text-anchor="middle" font-size="10">• Transaction History</text>
        <text x="410" y="500" text-anchor="middle" font-size="10">• Performance Calc</text>
        
        <!-- Social Service -->
        <rect x="540" y="420" width="180" height="100" fill="#c8e6c9" stroke="#388e3c" stroke-width="1" rx="5"/>
        <text x="630" y="440" text-anchor="middle" font-weight="bold" font-size="12">Social Service</text>
        <text x="630" y="455" text-anchor="middle" font-size="10">• Posts & Comments</text>
        <text x="630" y="470" text-anchor="middle" font-size="10">• Likes & Reactions</text>
        <text x="630" y="485" text-anchor="middle" font-size="10">• Feed Generation</text>
        <text x="630" y="500" text-anchor="middle" font-size="10">• Content Filtering</text>
        
        <!-- Market Data Service -->
        <rect x="760" y="420" width="180" height="100" fill="#c8e6c9" stroke="#388e3c" stroke-width="1" rx="5"/>
        <text x="850" y="440" text-anchor="middle" font-weight="bold" font-size="12">Market Data Service</text>
        <text x="850" y="455" text-anchor="middle" font-size="10">• Asset Prices</text>
        <text x="850" y="470" text-anchor="middle" font-size="10">• Price History</text>
        <text x="850" y="485" text-anchor="middle" font-size="10">• Watchlist Alerts</text>
        <text x="850" y="500" text-anchor="middle" font-size="10">• Market News</text>
        
        <!-- File Upload Service -->
        <rect x="980" y="420" width="180" height="100" fill="#c8e6c9" stroke="#388e3c" stroke-width="1" rx="5"/>
        <text x="1070" y="440" text-anchor="middle" font-weight="bold" font-size="12">File Service</text>
        <text x="1070" y="455" text-anchor="middle" font-size="10">• CSV Import</text>
        <text x="1070" y="470" text-anchor="middle" font-size="10">• Image Upload</text>
        <text x="1070" y="485" text-anchor="middle" font-size="10">• File Validation</text>
        <text x="1070" y="500" text-anchor="middle" font-size="10">• Storage Management</text>
        
        <!-- Notification Service -->
        <rect x="1200" y="420" width="180" height="100" fill="#c8e6c9" stroke="#388e3c" stroke-width="1" rx="5"/>
        <text x="1290" y="440" text-anchor="middle" font-weight="bold" font-size="12">Notification Service</text>
        <text x="1290" y="455" text-anchor="middle" font-size="10">• Email Alerts</text>
        <text x="1290" y="470" text-anchor="middle" font-size="10">• Push Notifications</text>
        <text x="1290" y="485" text-anchor="middle" font-size="10">• Price Alerts</text>
        <text x="1290" y="500" text-anchor="middle" font-size="10">• Social Updates</text>
      </g>
      
      <!-- Data Layer -->
      <g id="data-layer">
        <rect x="50" y="630" width="1500" height="150" fill="#ffebee" stroke="#d32f2f" stroke-width="2" rx="10"/>
        <text x="800" y="650" text-anchor="middle" font-weight="bold" font-size="16" fill="#d32f2f">DATA LAYER</text>
        
        <!-- Primary Database -->
        <rect x="200" y="670" width="200" height="80" fill="#ffcdd2" stroke="#d32f2f" stroke-width="1" rx="5"/>
        <text x="300" y="690" text-anchor="middle" font-weight="bold" font-size="12">Primary Database</text>
        <text x="300" y="705" text-anchor="middle" font-size="10">PostgreSQL/MySQL</text>
        <text x="300" y="720" text-anchor="middle" font-size="10">User, Portfolio, Transaction</text>
        <text x="300" y="735" text-anchor="middle" font-size="10">Post, Comment, Asset Data</text>
        
        <!-- Cache Layer -->
        <rect x="450" y="670" width="200" height="80" fill="#ffcdd2" stroke="#d32f2f" stroke-width="1" rx="5"/>
        <text x="550" y="690" text-anchor="middle" font-weight="bold" font-size="12">Cache Layer</text>
        <text x="550" y="705" text-anchor="middle" font-size="10">Redis/Memcached</text>
        <text x="550" y="720" text-anchor="middle" font-size="10">User Sessions</text>
        <text x="550" y="735" text-anchor="middle" font-size="10">Market Data Cache</text>
        
        <!-- File Storage -->
        <rect x="700" y="670" width="200" height="80" fill="#ffcdd2" stroke="#d32f2f" stroke-width="1" rx="5"/>
        <text x="800" y="690" text-anchor="middle" font-weight="bold" font-size="12">File Storage</text>
        <text x="800" y="705" text-anchor="middle" font-size="10">AWS S3/Google Cloud</text>
        <text x="800" y="720" text-anchor="middle" font-size="10">CSV Files, Images</text>
        <text x="800" y="735" text-anchor="middle" font-size="10">User Avatars</text>
        
        <!-- Search Engine -->
        <rect x="950" y="670" width="200" height="80" fill="#ffcdd2" stroke="#d32f2f" stroke-width="1" rx="5"/>
        <text x="1050" y="690" text-anchor="middle" font-weight="bold" font-size="12">Search Engine</text>
        <text x="1050" y="705" text-anchor="middle" font-size="10">Elasticsearch</text>
        <text x="1050" y="720" text-anchor="middle" font-size="10">Post Search</text>
        <text x="1050" y="735" text-anchor="middle" font-size="10">Asset Search</text>
      </g>
      
      <!-- External Services -->
      <g id="external-services">
        <rect x="50" y="830" width="1500" height="120" fill="#f3e5f5" stroke="#7b1fa2" stroke-width="2" rx="10"/>
        <text x="800" y="850" text-anchor="middle" font-weight="bold" font-size="16" fill="#7b1fa2">EXTERNAL SERVICES</text>
        
        <!-- Market Data APIs -->
        <rect x="150" y="870" width="200" height="60" fill="#e1bee7" stroke="#7b1fa2" stroke-width="1" rx="5"/>
        <text x="250" y="890" text-anchor="middle" font-weight="bold" font-size="12">Market Data APIs</text>
        <text x="250" y="905" text-anchor="middle" font-size="10">Alpha Vantage, Yahoo Finance</text>
        <text x="250" y="920" text-anchor="middle" font-size="10">Real-time Stock Prices</text>
        
        <!-- Email Service -->
        <rect x="400" y="870" width="200" height="60" fill="#e1bee7" stroke="#7b1fa2" stroke-width="1" rx="5"/>
        <text x="500" y="890" text-anchor="middle" font-weight="bold" font-size="12">Email Service</text>
        <text x="500" y="905" text-anchor="middle" font-size="10">SendGrid, AWS SES</text>
        <text x="500" y="920" text-anchor="middle" font-size="10">Notifications, Alerts</text>
        
        <!-- Payment Gateway -->
        <rect x="650" y="870" width="200" height="60" fill="#e1bee7" stroke="#7b1fa2" stroke-width="1" rx="5"/>
        <text x="750" y="890" text-anchor="middle" font-weight="bold" font-size="12">Payment Gateway</text>
        <text x="750" y="905" text-anchor="middle" font-size="10">Stripe, PayPal</text>
        <text x="750" y="920" text-anchor="middle" font-size="10">Premium Subscriptions</text>
        
        <!-- Push Notification -->
        <rect x="900" y="870" width="200" height="60" fill="#e1bee7" stroke="#7b1fa2" stroke-width="1" rx="5"/>
        <text x="1000" y="890" text-anchor="middle" font-weight="bold" font-size="12">Push Notifications</text>
        <text x="1000" y="905" text-anchor="middle" font-size="10">Firebase, APNs</text>
        <text x="1000" y="920" text-anchor="middle" font-size="10">Mobile Alerts</text>
        
        <!-- Analytics -->
        <rect x="1150" y="870" width="200" height="60" fill="#e1bee7" stroke="#7b1fa2" stroke-width="1" rx="5"/>
        <text x="1250" y="890" text-anchor="middle" font-weight="bold" font-size="12">Analytics</text>
        <text x="1250" y="905" text-anchor="middle" font-size="10">Google Analytics</text>
        <text x="1250" y="920" text-anchor="middle" font-size="10">User Behavior Tracking</text>
      </g>
      
      <!-- Infrastructure Layer -->
      <g id="infrastructure">
        <rect x="50" y="1000" width="1500" height="100" fill="#fff8e1" stroke="#ffa000" stroke-width="2" rx="10"/>
        <text x="800" y="1020" text-anchor="middle" font-weight="bold" font-size="16" fill="#ffa000">INFRASTRUCTURE LAYER</text>
        
        <!-- Cloud Platform -->
        <rect x="200" y="1040" width="300" height="40" fill="#ffecb3" stroke="#ffa000" stroke-width="1" rx="5"/>
        <text x="350" y="1065" text-anchor="middle" font-weight="bold" font-size="12">Cloud Platform (AWS/GCP/Azure)</text>
        
        <!-- Container Orchestration -->
        <rect x="550" y="1040" width="200" height="40" fill="#ffecb3" stroke="#ffa000" stroke-width="1" rx="5"/>
        <text x="650" y="1065" text-anchor="middle" font-weight="bold" font-size="12">Kubernetes/Docker</text>
        
        <!-- Monitoring -->
        <rect x="800" y="1040" width="200" height="40" fill="#ffecb3" stroke="#ffa000" stroke-width="1" rx="5"/>
        <text x="900" y="1065" text-anchor="middle" font-weight="bold" font-size="12">Monitoring & Logging</text>
        
        <!-- CI/CD -->
        <rect x="1050" y="1040" width="200" height="40" fill="#ffecb3" stroke="#ffa000" stroke-width="1" rx="5"/>
        <text x="1150" y="1065" text-anchor="middle" font-weight="bold" font-size="12">CI/CD Pipeline</text>
      </g>
      
      <!-- Connection Lines -->
      <!-- Client to API Gateway -->
      <line x1="200" y1="180" x2="700" y2="250" stroke="black" stroke-width="2"/>
      <line x1="450" y1="180" x2="800" y2="250" stroke="black" stroke-width="2"/>
      <line x1="700" y1="180" x2="900" y2="250" stroke="black" stroke-width="2"/>
      
      <!-- API Gateway to Services -->
      <line x1="750" y1="330" x2="190" y2="420" stroke="black" stroke-width="1"/>
      <line x1="780" y1="330" x2="410" y2="420" stroke="black" stroke-width="1"/>
      <line x1="800" y1="330" x2="630" y2="420" stroke="black" stroke-width="1"/>
      <line x1="820" y1="330" x2="850" y2="420" stroke="black" stroke-width="1"/>
      <line x1="850" y1="330" x2="1070" y2="420" stroke="black" stroke-width="1"/>
      <line x1="870" y1="330" x2="1290" y2="420" stroke="black" stroke-width="1"/>
      
      <!-- Services to Data Layer -->
      <line x1="250" y1="520" x2="300" y2="670" stroke="black" stroke-width="1"/>
      <line x1="450" y1="520" x2="300" y2="670" stroke="black" stroke-width="1"/>
      <line x1="630" y1="520" x2="550" y2="670" stroke="black" stroke-width="1"/>
      <line x1="850" y1="520" x2="550" y2="670" stroke="black" stroke-width="1"/>
      <line x1="1070" y1="520" x2="800" y2="670" stroke="black" stroke-width="1"/>
      
      <!-- Services to External APIs -->
      <line x1="850" y1="520" x2="250" y2="870" stroke="black" stroke-width="1" stroke-dasharray="5,5"/>
      <line x1="1290" y1="520" x2="500" y2="870" stroke="black" stroke-width="1" stroke-dasharray="5,5"/>
      <line x1="410" y1="520" x2="750" y2="870" stroke="black" stroke-width="1" stroke-dasharray="5,5"/>
      <line x1="1290" y1="520" x2="1000" y2="870" stroke="black" stroke-width="1" stroke-dasharray="5,5"/>
      
      <!-- Arrow indicators -->
      <defs>
        <marker id="arrowhead" markerWidth="10" markerHeight="7" refX="10" refY="3.5" orient="auto">
          <polygon points="0 0, 10 3.5, 0 7" fill="black"/>
        </marker>
      </defs>
      
      <!-- Legend -->
      <g id="legend">
        <rect x="1350" y="250" width="200" height="120" fill="white" stroke="black" stroke-width="1"/>
        <text x="1450" y="270" text-anchor="middle" font-weight="bold" font-size="12">LEGEND</text>
        <line x1="1360" y1="285" x2="1390" y2="285" stroke="black" stroke-width="2"/>
        <text x="1400" y="290" font-size="10">Synchronous Call</text>
        <line x1="1360" y1="305" x2="1390" y2="305" stroke="black" stroke-width="1" stroke-dasharray="5,5"/>
        <text x="1400" y="310" font-size="10">External API Call</text>
        <text x="1360" y="330" font-size="10">Data Flow Direction:</text>
        <text x="1360" y="345" font-size="10">Client → API → Services</text>
        <text x="1360" y="360" font-size="10">→ Data → External</text>
      </g>
    </svg>



## Technologies

### Frontend
- **React / Next.js** – Core framework for UI with server-side rendering support
- **Tailwind CSS** – Utility-first CSS framework for styling

### Backend
- **PostgreSQL** – Primary relational database
- **Redis** – Used for caching community posts (image URLs stored externally)
- **GraphQL** – API communication between front end and back end
- **Spring Boot** - Back end framework for business layer and data handling

### DevOps
- **Git**
- **GitHub** – Version control repository
- **GitHub Actions** – CI/CD automation pipeline
- **Docker** – Containerization and deployment management

### Tools
- **JIRA** – Project tracking and issue management
- **Canva** – System block diagrams and visuals
- **Figma** – UI/UX design
- **Draw.io** – UML modeling and database design

## Dependencies
- **Java JDK** – Latest LTS (current or JDK 24, depending on stability)
- **TypeScript** – Typed JavaScript for frontend/backend logic
- **Node.js** – Runtime for Next.js and backend processing
- **Supabase** – Cloud storage for images, authentication, and database management
- **Yahoo API / Other Financial Stock API** – Market data for finance-related features


## Risk
### Cost
In terms of cost, I really don't want to spend that much money, as in I don't want to end up as that one Vercel user with a 100k bill at the end of the month. We can mitigate this by using free tier solutions, hence the use of supabase for the DB (no idea for actual hosting), but if this does become popular, the project would need a way to generate income for the servers and other unforseen application cost. Additionally would need a domain promotion down the line, but I don't think that is necessary, at least at the time of writing this...

### Competition
The main competition I see with this application are Ghostfolio, WealthFolio, Blossom, and Reddit. The first 2 already have an active fandbase and strong set of features at hand which means that competing against them would be difficult. Blossom and Reddit are techinically competitors in terms of the social aspect as they have community built around finance. Addition competitors not listed are Portfolio tracking website that already exist. The way to get around the competition, at least in my mind, is easy of use - at least for the portfolio side. The portolfio applications I mentioned before, I have used and while I like the design, some have limited features and are clusmy to import data, at least for the average consumer. I would be focusing on UX for the most part. As for the others... Blossom in its marketing, has 250K+ users with Reddit probably 1 billion+ users. 

The Blossom application would be the main inspiration and I would like to expand on some of their concepts would be the goal of this project.

### Third Party Limitations
A huge limitation I faced from my previous project was the APIs. TMDB does not have access to the streaming service links where said movie is located. This might happen with the APIs I would be using to get the stock data (haven't decided yet). These limitations could mean that in the rare case I can monitize this application - BIG IF, I would need to upgrade to their commerical API or swap it out entirely due to their TOS. We can mitigate this by building modular API services so we can swap out the data easily, or just find 1 good API we can use.


### Scope/Feasibility 
- I am asking myself to build 2 systems really. A fourms platform and a portfolio tracking platform. As personally experienced in the last project I did, Streamsage, I scope creep that thing so hard that in the end, I wasn't able to deliver what I wanted to in the beginning, while a good thing, has taught me that I shouldn't aim that high for the sun. The following things are what I am going to do/the project entails, any deviation from the original concept will be considered out of scope and will haunt me 3 weeks from now. We will NOT be implementing the preimum features seen in the read me document. ALSO, we are developing for the WEB first, then mobile, so don't think about mobile features just yet, 

  - Portfolio tracking feature for logged in user (user handled via Supabase, mainly all data is via supabase)
    - Similar concept to Ghostfolio/Wealthfolio in terms of what I want to do
      - Track the following items:
  
        - Stocks
        - ETFS
        - Crypto (done properly, there is a Issue in Ghostfolio about how the tracking is not right)
        - Dividends / interest
        - free cash
       
      - Have a basic breakdown (e.g. region of the world, stocks vs free cash). Again use Ghostfolio and Blossom as a reference
      - An easy way to input multiple data, whether that be showing them a .csv template they can enter their data or when entering data into the website, we can do a button like - 'and new using previous ticker' and 'start new'
     
  - In addition to the portfolio tracker, we need to fourms thing. Look up how Blossom or reddit handles the data, for now we will just be supporting text based fourms with liking, replying (threads like and in the comment section) and hearting a comment. sharing a comment will be nice, but I don't know how to implement that just yet, we are going to move to mobile later so that might be an issue, but I'm sure the Android/IOS SDK have something for this...

- The feasibility of this project is also a concern/risk. The last project, had used lots of external tools (i.e. AI, but I really want to stick to my roots and look up tutorials and other resources for learning, I am actively seeing myself lower my intelligence because of AI...) Joke-ish aside, I would like to complete this project within a fast timeframe, maybe 3-4 months. the last project started a bit wonky because I had to return my laptop, so that took about a month off which should have been a 1 month job. I am going to mitigate teh risk on the feasibility by actually sticking to a TODO plan with JIRA and using the issues tab for tracking my progress, not like before where I just had a TODO file in the project which I never update. There is also Projects in GitHub? could be a good way to track issues without the need for JIRA

- Another feasibility that came to mind, algorithms for user content... How does Instagram know what I would like? My likes/saves/watch time. we would need meta data for each post...

## Use Cases
*there is a github flowchart webapp out there, will be using that to create the use cases (Attributions as always provided in the document)*

![image](https://github.com/user-attachments/assets/91c960d7-30b0-478a-b74a-ac07ed7b0c9d)

#### RAW DATA
  CODE FOR https://flowchart.fun/
  
    USER .shape_ellipse
      vists: websites .shape_diamond
        clicks_button: login page
          Login
            fill in: user and password
                is Sucessful? .shape_diamond
                  authenticate: Supabase
                    go back to webiste .shape_ellipse
                  throws error: error .shape_ellipse
          register
            fills in form
              is Sucessful? .shape_diamond
                go back to webiste .shape_ellipse
                throws error: error .shape_ellipse
        doom_scrolls: popular post and news
          likes_show_pop: goes to login_page .shape_ellipse
          comments_show_pop: goes to login_page .shape_ellipse
        
        if_user_logged_in: account
          edit: Account_details
            delete: Account? .shape_triangle
              yes
                Supabase_processor: deletes user and info .shape_ellipse
              no: (Account?)
          Portfolio
            view: Overview
            add: new record
              isSuccessful: (Overview)



## UML Diagram
![image](https://github.com/user-attachments/assets/97ba2f26-4385-4d4e-aedc-c41d70039589)





## GUI Layout
*might be put off for a bit until we have the back end done*

## ER Diagram
*yes I used Claude to generate this... the excuse I came up with that will bite me is that I created the UML diagram, I basically discribed the database already
![image](https://github.com/user-attachments/assets/1ce771c0-bc00-4637-9c63-34fba94950dc)

      <svg viewBox="0 0 1400 1000" xmlns="http://www.w3.org/2000/svg">
     
      <!-- User Entity -->
      <g id="user-entity">
        <rect x="50" y="50" width="180" height="200" fill="#e3f2fd" stroke="#1976d2" stroke-width="2"/>
        <text x="140" y="40" text-anchor="middle" font-weight="bold" font-size="14">USER</text>
        <line x1="50" y1="50" x2="230" y2="50" stroke="#1976d2" stroke-width="2"/>
        <text x="60" y="70" font-size="12" font-weight="bold">userID (PK)</text>
        <line x1="60" y1="75" x2="150" y2="75" stroke="black"/>
        <text x="60" y="90" font-size="12">username</text>
        <text x="60" y="105" font-size="12">email</text>
        <text x="60" y="120" font-size="12">password</text>
        <text x="60" y="135" font-size="12">createdAt</text>
        <text x="60" y="150" font-size="12">lastLoginDate</text>
        <text x="60" y="165" font-size="12">isLocked</text>
        <text x="60" y="180" font-size="12">avatarURL</text>
        <text x="60" y="195" font-size="12">isPrivate</text>
        <text x="60" y="210" font-size="12">followCount</text>
        <text x="60" y="225" font-size="12">followingCount</text>
      </g>
    
      <!-- Portfolio Entity -->
      <g id="portfolio-entity">
        <rect x="300" y="50" width="180" height="140" fill="#e8f5e8" stroke="#388e3c" stroke-width="2"/>
        <text x="390" y="40" text-anchor="middle" font-weight="bold" font-size="14">PORTFOLIO</text>
        <line x1="300" y1="50" x2="480" y2="50" stroke="#388e3c" stroke-width="2"/>
        <text x="310" y="70" font-size="12" font-weight="bold">portfolioID (PK)</text>
        <line x1="310" y1="75" x2="420" y2="75" stroke="black"/>
        <text x="310" y="90" font-size="12">userID (FK)</text>
        <text x="310" y="105" font-size="12">name</text>
        <text x="310" y="120" font-size="12">isDefault</text>
        <text x="310" y="135" font-size="12">currency</text>
        <text x="310" y="150" font-size="12">createdAt</text>
        <text x="310" y="165" font-size="12">portfolioType</text>
      </g>
    
      <!-- Asset Entity -->
      <g id="asset-entity">
        <rect x="550" y="300" width="180" height="160" fill="#fff3e0" stroke="#f57c00" stroke-width="2"/>
        <text x="640" y="290" text-anchor="middle" font-weight="bold" font-size="14">ASSET</text>
        <line x1="550" y1="300" x2="730" y2="300" stroke="#f57c00" stroke-width="2"/>
        <text x="560" y="320" font-size="12" font-weight="bold">assetID (PK)</text>
        <line x1="560" y1="325" x2="630" y2="325" stroke="black"/>
        <text x="560" y="340" font-size="12">name</text>
        <text x="560" y="355" font-size="12">symbol</text>
        <text x="560" y="370" font-size="12">description</text>
        <text x="560" y="385" font-size="12">assetType</text>
        <text x="560" y="400" font-size="12">currentPrice</text>
        <text x="560" y="415" font-size="12">lastUpdated</text>
        <text x="560" y="430" font-size="12">currency</text>
      </g>
    
      <!-- Portfolio_Asset Junction Entity -->
      <g id="portfolio-asset-entity">
        <rect x="300" y="250" width="200" height="180" fill="#f3e5f5" stroke="#7b1fa2" stroke-width="2"/>
        <text x="400" y="240" text-anchor="middle" font-weight="bold" font-size="14">PORTFOLIO_ASSET</text>
        <line x1="300" y1="250" x2="500" y2="250" stroke="#7b1fa2" stroke-width="2"/>
        <text x="310" y="270" font-size="12" font-weight="bold">portfolioID (PK,FK)</text>
        <line x1="310" y1="275" x2="440" y2="275" stroke="black"/>
        <text x="310" y="290" font-size="12" font-weight="bold">assetID (PK,FK)</text>
        <line x1="310" y1="295" x2="400" y2="295" stroke="black"/>
        <text x="310" y="310" font-size="12">quantity</text>
        <text x="310" y="325" font-size="12">averageCost</text>
        <text x="310" y="340" font-size="12">totalCost</text>
        <text x="310" y="355" font-size="12">currentValue</text>
        <text x="310" y="370" font-size="12">dateFirstPurchased</text>
        <text x="310" y="385" font-size="12">lastUpdated</text>
        <text x="310" y="400" font-size="12">unrealizedGainLoss</text>
      </g>
    
      <!-- Transaction Entity -->
      <g id="transaction-entity">
        <rect x="50" y="300" width="200" height="200" fill="#ffebee" stroke="#d32f2f" stroke-width="2"/>
        <text x="150" y="290" text-anchor="middle" font-weight="bold" font-size="14">TRANSACTION</text>
        <line x1="50" y1="300" x2="250" y2="300" stroke="#d32f2f" stroke-width="2"/>
        <text x="60" y="320" font-size="12" font-weight="bold">transactionID (PK)</text>
        <line x1="60" y1="325" x2="180" y2="325" stroke="black"/>
        <text x="60" y="340" font-size="12">portfolioID (FK)</text>
        <text x="60" y="355" font-size="12">assetID (FK)</text>
        <text x="60" y="370" font-size="12">tradeType</text>
        <text x="60" y="385" font-size="12">quantity</text>
        <text x="60" y="400" font-size="12">tradePrice</text>
        <text x="60" y="415" font-size="12">totalAmount</text>
        <text x="60" y="430" font-size="12">fees</text>
        <text x="60" y="445" font-size="12">tradeDate</text>
        <text x="60" y="460" font-size="12">notes</text>
        <text x="60" y="475" font-size="12">exchangeRate</text>
      </g>
    
      <!-- Post Entity -->
      <g id="post-entity">
        <rect x="800" y="50" width="180" height="180" fill="#e1f5fe" stroke="#0288d1" stroke-width="2"/>
        <text x="890" y="40" text-anchor="middle" font-weight="bold" font-size="14">POST</text>
        <line x1="800" y1="50" x2="980" y2="50" stroke="#0288d1" stroke-width="2"/>
        <text x="810" y="70" font-size="12" font-weight="bold">postID (PK)</text>
        <line x1="810" y1="75" x2="870" y2="75" stroke="black"/>
        <text x="810" y="90" font-size="12">userID (FK)</text>
        <text x="810" y="105" font-size="12">content</text>
        <text x="810" y="120" font-size="12">dateCreated</text>
        <text x="810" y="135" font-size="12">dateUpdated</text>
        <text x="810" y="150" font-size="12">likeCount</text>
        <text x="810" y="165" font-size="12">commentCount</text>
        <text x="810" y="180" font-size="12">isPublic</text>
        <text x="810" y="195" font-size="12">postType</text>
      </g>
    
      <!-- Comment Entity -->
      <g id="comment-entity">
        <rect x="1050" y="50" width="180" height="160" fill="#f9fbe7" stroke="#689f38" stroke-width="2"/>
        <text x="1140" y="40" text-anchor="middle" font-weight="bold" font-size="14">COMMENT</text>
        <line x1="1050" y1="50" x2="1230" y2="50" stroke="#689f38" stroke-width="2"/>
        <text x="1060" y="70" font-size="12" font-weight="bold">commentID (PK)</text>
        <line x1="1060" y1="75" x2="1150" y2="75" stroke="black"/>
        <text x="1060" y="90" font-size="12">postID (FK)</text>
        <text x="1060" y="105" font-size="12">userID (FK)</text>
        <text x="1060" y="120" font-size="12">content</text>
        <text x="1060" y="135" font-size="12">dateCreated</text>
        <text x="1060" y="150" font-size="12">parentCommentID (FK)</text>
        <text x="1060" y="165" font-size="12">likeCount</text>
        <text x="1060" y="180" font-size="12">isDeleted</text>
      </g>
    
      <!-- Followers Junction Entity -->
      <g id="followers-entity">
        <rect x="50" y="550" width="200" height="120" fill="#fce4ec" stroke="#c2185b" stroke-weight="2"/>
        <text x="150" y="540" text-anchor="middle" font-weight="bold" font-size="14">FOLLOWERS</text>
        <line x1="50" y1="550" x2="250" y2="550" stroke="#c2185b" stroke-width="2"/>
        <text x="60" y="570" font-size="12" font-weight="bold">followerID (PK,FK)</text>
        <line x1="60" y1="575" x2="170" y2="575" stroke="black"/>
        <text x="60" y="590" font-size="12" font-weight="bold">followingID (PK,FK)</text>
        <line x1="60" y1="595" x2="180" y2="595" stroke="black"/>
        <text x="60" y="610" font-size="12">dateFollowed</text>
        <text x="60" y="625" font-size="12">isActive</text>
        <text x="60" y="640" font-size="12">notificationEnabled</text>
      </g>
    
      <!-- Watchlist Entity -->
      <g id="watchlist-entity">
        <rect x="550" y="550" width="180" height="140" fill="#fff8e1" stroke="#ffa000" stroke-width="2"/>
        <text x="640" y="540" text-anchor="middle" font-weight="bold" font-size="14">WATCHLIST</text>
        <line x1="550" y1="550" x2="730" y2="550" stroke="#ffa000" stroke-width="2"/>
        <text x="560" y="570" font-size="12" font-weight="bold">userID (PK,FK)</text>
        <line x1="560" y1="575" x2="630" y2="575" stroke="black"/>
        <text x="560" y="590" font-size="12" font-weight="bold">assetID (PK,FK)</text>
        <line x1="560" y1="595" x2="640" y2="595" stroke="black"/>
        <text x="560" y="610" font-size="12">dateAdded</text>
        <text x="560" y="625" font-size="12">targetPrice</text>
        <text x="560" y="640" font-size="12">alertEnabled</text>
        <text x="560" y="655" font-size="12">notes</text>
      </g>
    
      <!-- Like Entity -->
      <g id="like-entity">
        <rect x="800" y="300" width="180" height="120" fill="#f3e5f5" stroke="#8e24aa" stroke-width="2"/>
        <text x="890" y="290" text-anchor="middle" font-weight="bold" font-size="14">LIKE</text>
        <line x1="800" y1="300" x2="980" y2="300" stroke="#8e24aa" stroke-width="2"/>
        <text x="810" y="320" font-size="12" font-weight="bold">likeID (PK)</text>
        <line x1="810" y1="325" x2="860" y2="325" stroke="black"/>
        <text x="810" y="340" font-size="12">userID (FK)</text>
        <text x="810" y="355" font-size="12">postID (FK)</text>
        <text x="810" y="370" font-size="12">commentID (FK)</text>
        <text x="810" y="385" font-size="12">dateCreated</text>
        <text x="810" y="400" font-size="12">likeType</text>
      </g>
    
      <!-- Relationships -->
      <!-- User to Portfolio (1:M) -->
      <line x1="230" y1="100" x2="300" y2="100" stroke="black" stroke-width="2"/>
      <text x="250" y="95" font-size="10">1</text>
      <text x="285" y="95" font-size="10">M</text>
      <circle cx="300" cy="100" r="3" fill="black"/>
    
      <!-- Portfolio to Portfolio_Asset (1:M) -->
      <line x1="390" y1="190" x2="390" y2="250" stroke="black" stroke-width="2"/>
      <text x="370" y="210" font-size="10">1</text>
      <text x="370" y="240" font-size="10">M</text>
      <circle cx="390" cy="250" r="3" fill="black"/>
    
      <!-- Asset to Portfolio_Asset (1:M) -->
      <line x1="550" y1="350" x2="500" y2="350" stroke="black" stroke-width="2"/>
      <text x="530" y="345" font-size="10">1</text>
      <text x="510" y="345" font-size="10">M</text>
      <circle cx="500" cy="350" r="3" fill="black"/>
    
      <!-- Portfolio to Transaction (1:M) -->
      <line x1="300" y1="150" x2="250" y2="300" stroke="black" stroke-width="2"/>
      <text x="280" y="170" font-size="10">1</text>
      <text x="260" y="290" font-size="10">M</text>
      <circle cx="250" cy="300" r="3" fill="black"/>
    
      <!-- Asset to Transaction (1:M) -->
      <line x1="550" y1="400" x2="250" y2="400" stroke="black" stroke-width="2"/>
      <text x="530" y="395" font-size="10">1</text>
      <text x="260" y="395" font-size="10">M</text>
      <circle cx="250" cy="400" r="3" fill="black"/>
    
      <!-- User to Post (1:M) -->
      <line x1="230" y1="150" x2="800" y2="150" stroke="black" stroke-width="2"/>
      <text x="250" y="145" font-size="10">1</text>
      <text x="780" y="145" font-size="10">M</text>
      <circle cx="800" cy="150" r="3" fill="black"/>
    
      <!-- Post to Comment (1:M) -->
      <line x1="980" y1="100" x2="1050" y2="100" stroke="black" stroke-width="2"/>
      <text x="990" y="95" font-size="10">1</text>
      <text x="1040" y="95" font-size="10">M</text>
      <circle cx="1050" cy="100" r="3" fill="black"/>
    
      <!-- User to Comment (1:M) -->
      <line x1="230" y1="80" x2="1050" y2="120" stroke="black" stroke-width="1"/>
      <text x="250" y="85" font-size="10">1</text>
      <text x="1030" y="125" font-size="10">M</text>
    
      <!-- User to Followers (M:M) -->
      <line x1="140" y1="250" x2="140" y2="550" stroke="black" stroke-width="2"/>
      <text x="120" y="270" font-size="10">M</text>
      <text x="120" y="540" font-size="10">M</text>
      <circle cx="140" cy="550" r="3" fill="black"/>
    
      <!-- User to Watchlist (1:M) -->
      <line x1="230" y1="200" x2="550" y2="600" stroke="black" stroke-width="2"/>
      <text x="250" y="220" font-size="10">1</text>
      <text x="530" y="605" font-size="10">M</text>
      <circle cx="550" cy="600" r="3" fill="black"/>
    
      <!-- Asset to Watchlist (1:M) -->
      <line x1="640" y1="460" x2="640" y2="550" stroke="black" stroke-width="2"/>
      <text x="620" y="480" font-size="10">1</text>
      <text x="620" y="540" font-size="10">M</text>
      <circle cx="640" cy="550" r="3" fill="black"/>
    
      <!-- User to Like (1:M) -->
      <line x1="230" y1="180" x2="800" y2="350" stroke="black" stroke-width="1"/>
      <text x="250" y="200" font-size="10">1</text>
      <text x="780" y="355" font-size="10">M</text>
    
      <!-- Post to Like (1:M) -->
      <line x1="890" y1="230" x2="890" y2="300" stroke="black" stroke-width="2"/>
      <text x="870" y="250" font-size="10">1</text>
      <text x="870" y="290" font-size="10">M</text>
      <circle cx="890" cy="300" r="3" fill="black"/>
    
      <!-- Legend -->
      <g id="legend">
        <rect x="1050" y="800" width="300" height="150" fill="white" stroke="black" stroke-width="1"/>
        <text x="1200" y="820" text-anchor="middle" font-weight="bold" font-size="14">LEGEND</text>
        <text x="1060" y="840" font-size="12">PK = Primary Key</text>
        <text x="1060" y="855" font-size="12">FK = Foreign Key</text>
        <text x="1060" y="870" font-size="12">Underlined = Primary Key</text>
        <text x="1060" y="885" font-size="12">1 = One</text>
        <text x="1060" y="900" font-size="12">M = Many</text>
        <text x="1060" y="915" font-size="12">Circle = "Many" side of relationship</text>
        <text x="1060" y="930" font-size="12">Junction Tables = Many-to-Many relationships</text>
      </g>
    
      <!-- Title -->
      <text x="700" y="30" text-anchor="middle" font-weight="bold" font-size="18" fill="#1976d2">Personal Finance Platform - ER Diagram (3NF)</text>
    </svg>




## Approach to the Application
For this application, we will be doing a Domain Driven Design pattern. The current project will be setup as a monolith application, because lets be honest, you are not scaling to millions of users, but with DDD, we can transition it from mono to microservices in the chance it does make sense to do so. We will also be following TDD - Test Driven Design. This will save use from ourselves with unit testing, I experienced the pain of code not working because of chooses maded weeks past. 


The following are classes/systems we will need

Classes
- User (handled by DB provider)
- Portfolio (Aggergate of all stocks held + other assets (e.g. cash, crypto, physical metals)
- Asset (for categorizing your investments (e.g. stock, crypto, cash, etc.)
- PriceHistory (for users who want historical performance)
- Stock (things related to the stock itself (e.g. name, current price, Symbol, description, etc.)
- Transaction (record of what the user performed - a trade action)
- Tag (can tap assets or transaction for searchability and filtering)
- Watchlist (a user may want to have a stock on a list without buying it)

  
- Post (when a user Post something on the forum)
- Comments (For the forum post)
  
- Reporting (thing about bug report, a system where users can report a buy? Optional - didn't impelment it in the last app I made)
  - AuditLog (store system activity to assist with debugging)
 


Focus on getting users able to:

Import/enter their trades
View their portfolio
Make posts about their experience
Basic community interaction
  
---
Timeline - WIP
- Planning: 5 days (incorporate Agile planning)
- ~Analysis: 2 days (user interviews and market research)~
- Design: 5 days (prototyping and workflow)
- Implement: 1 month
- Test: 7 days (automated testing, CI/CD)
- Deploy: 2 days (streamlined deployment with CI/CD)
- Post-Launch: 1 day (monitoring)

3 sprints, 3 deliverables
The Java backend + API setup
The fronted
Deploying it


------
This Is the end of the Project Documentation
