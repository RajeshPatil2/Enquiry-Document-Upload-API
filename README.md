
**PROJECT NAME**
==================================================
**Enquiry-Document-Upload-API**

==================================================
**PROJECT OVERVIEW**
**This project is a Spring Boot REST API used to
register customer enquiries along with document
uploads like Profile Photo, Aadhaar Card and PAN Card.**

**It simulates a real-world enquiry / KYC system
used in Banking, Finance, Insurance and Service
Applications.**

==================================================
**WHAT PROBLEM THIS PROJECT SOLVES**

**• Accepts enquiry details in JSON format**
**• Uploads multiple documents in a single request**
**• Stores documents securely in database**
**• Fetches enquiry details using enquiry ID**

==================================================
**REAL WORLD USE CASE**

**• Bank Loan Enquiry**
**• Insurance Customer Registration**
**• Admission / Verification Systems**
**• KYC Document Upload Process**

==================================================
**TECHNOLOGIES USED**

**• Java**
**• Spring Boot**
**• Spring Web (REST API)**
**• Spring Data JPA**
**• Hibernate**
**• MySQL / RDBMS**
**• Multipart File Upload**
**• Jackson ObjectMapper**

==================================================
**KEY FEATURES**
**• Multipart request handling**
**• JSON + File upload in single API**
**• @Lob used for large document storage**
**• Clean Controller – Service – Repository architecture**
**• Easy to extend for microservices**

==================================================
**ARCHITECTURE (LAYERED DESIGN)**

**Controller Layer**
→ Handles REST APIs and multipart requests

**Service Layer**
→ Business logic for saving and fetching enquiries

**Repository Layer**
→ Database interaction using JPA

**Entity Layer**
→ EnquiryDetails entity with document fields


==================================================
**API ENDPOINTS**
**POST /enquiry**
→ Registers enquiry with documents

**GET /enquiry?enquiryId={id}**
→ Fetch enquiry details by ID

==================================================
**IMPORTANT ANNOTATIONS USED**
==================================================
**@RestController**
→ Defines REST API

**@RequestPart**
→ Accepts JSON + files together

**@Lob**
→ Stores large documents in database

**ObjectMapper**
→ Converts JSON string to Java object

==================================================
**AUTHOR**
==================================================
**Rajesh Patil**
**Java | Spring Boot | REST APIs | Microservices**
==================================================
