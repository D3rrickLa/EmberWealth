Author: D3rrick La

Version: 0.0.1


## Summary
FIREFinance (PLACEHOLDER - name to be determine) is a social platform for anyone who wants to take their finances to the next level. Whether you are a beginner or an expert about all things finance, this platform is here for you to share your journey to financial freedom.
The application is targetted towards 18 - 45 year olds, as based on own observations, that is the age range where people will tend to care about/know about FIRE. The application was born out of my desire to track my finances and have a centralized place
where I can see where is my money flowing, along with tracking my goals and if I am on target. Currently, there isn't a unified/easy way for people to track their finances, often relying on spreadsheets or clunking software with subscription models.

This project will combine both the tracking of your finance with the social aspect of today's world. We will have a dedicated forms/post feature where uses can post their stories about their journey towards finance independence. The following document is a representation of how the project is being built, why we did it in such a way, and a reference point if we are getting off track.



## System Block Diagram
- TODO



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

![image](https://github.com/user-attachments/assets/f72fc6e3-9b6f-438c-9c99-6a13255b2ccd)

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
![image](https://github.com/user-attachments/assets/27dc21c3-23a7-4bbe-903e-d4b496671e69)




## GUI Layout
*might be put off for a bit until we have the back end done*

## ER Diagram





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
