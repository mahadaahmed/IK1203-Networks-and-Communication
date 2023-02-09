# Quiz Answers
## Home Assignment 1 Quiz
**Question 1: Combine the following network access methods with the correct network technologies.**

- IEEE 802.11b/g/n -> Wireless local access
- Ethernet -> Wired local access
- ADSL -> Access over the fixed telephone network
- 3G, 4G (LTE) -> Access over mobile networks
- DOCSIS -> Access over cable tv networks

---

**Question 2: The questions is about the structure of the Internet. The Internet can be described as consisting of different kinds of organization, often companies, mainly Internet Service Providers (ISPs) and Internet Exchange Points (IXPs). We distinguish between to types of ISPs: Tier 1 ISPs and Access ISPs. Combine the descriptions below with the correct organization types:**

- Connects to the end user (home, company, university, etc) -> Access ISP
- Often has international coverage -> Tier 1 ISP
- A meetling place where ISPs connect to each other -> IXP
- Is usually a customer of one (or more) Tier 1 ISPs, and is being charged for sending and receiving traffic -> Access ISP
- Have mutual agreements for exchanging traffic with each other, free of charge ("peering agreements") -> Tier 1 ISP

---

**Question 3: Assume a simple model of the Internet with computers ("hosts"), switches ("routers") and links. For each layer in the Internet protocol stack, choose the description of its functionality that matches best. (When two devices are "directly connected", it means that there are no routers in between.)**

- Application layer -> Rules for communication between processes on different hosts that together make up an application.
- Transport layer -> Provides support for communication between processes on different hosts. 
- Network layer -> Provides support for communication between hosts via nay routers in between.
- Link layer -> Provides support for communication between directly connected routers or hosts.
- Physical layer -> Defines for instance electrical and optical properties of a link

---

**Question 4: Combine the protocols below with the correct layer in the Internet protocol stack.**

- Application layer -> SMTP
- Transport layer -> TCP
- Network layer -> IP - Internet Protocol
- Link layer -> Ethernet

---

**Question 5: This question is about communication according to the client-server application architecture. Which of the following statements are correct about the client-server architecture?**

- [x] Clients do not communicate directly with each other.
- [ ] A client has a fixed address in the network. 
- [x] In practice, a server can consist of many computers that are reached at a common address.
- [ ] A server deals with only one client at a time.
- [x] A server has a fixed address in the network.

---

**Question 6: What statements are correct about communication according to the peer-to-peer application architecture (P2P)?**

- [ ] P2P networks are controlled by special servers, so called super nodes, which are owned and managed by the organization that controls the network.
- [x] A P2P network has no predefined structure. Instead, it is formed dynamically by the nodes ("peers") that for the moment are participating in the network (sharing a file, for instance).
- [ ] P2P networks are for distribution of copyright-protected material, and therefore illegal.
- [x] P2P networks rely on the principle that users make their resources available for sharing (resources for storage, communication, processing, etc).
- [ ] In a P2P network, there is no need for port numbers.

---

**Question 7: Consider the following statements about World Wide Web applications. What is true? (This question is about HTTP/1.1, as covered in the textbook and the lectures.)**

- [x] By using web caches it is possible to reduce the response time for client requests.
- [ ] HTTP is a "stateful" protocol, meaning that an HTTP server maintains "state" to keep track of the clients that are currently visiting the site.
- [x] HTTP is a text-based protocol (not binary), which means that HTTP requests and responses are transmitted in text format.
- [ ] HTTP is used to transfer HTML pages. Other types of web objects (such as images) are transmitted with FTP.
- [x] Each web object (page, image, movie, etc.) has a unique identifier that can be used to address the object.

---

**Question 8: You want to use your web browser to fetch a web page from a site called "www.wagstaff.info". Its web server is at TCP port 8080, and the page you are looking for is called "horse.html". Give the URL that you enter into the navigation field of your web browser.**

http://www.wagstaff.info:8080/horse.html or https://www.wagstaff.info:8080/horse.html

<br>
<br>
<br>

## Home Assignment 2

**Question 1: Which of the following statements about TCP are correct?**

- [x] The flow control used by TCP normally gives superior performance compared to stop-and-wait.
- [ ] All segments of a TCP connection will follow the same path through the network. 
- [ ] TCP and UDP will share the available bandwidth in fair manner. 
- [x] TCP includes mechanisms both for flow control and for congestion control. 
- [x] The retransmission timeout used by TCP depends partly on the distance between sender and receiver.
- [x] Before data can be transmitted, a connection has to be established.
- [ ] Assume we use TCP to transfer a file. If a segment in the middle is lost, TCP has to wait for a timeout before the segment can be retransmitted.
- [ ] TCP can guarantee that an application gets the bandwidth it requires.

---

**Question 2: Which of the following statements about DNS are true?**

- [x] A DNS server uses caching to be able to answer queries faster. 
- [x] Each organization, company, etc., that has a domain name is also responsible for answering DNS queries about its domain.
- [ ] A client that wants to do a DNS lookup sends its query to a root server.  
- [ ] DNS is a distributed database and therefore does not use the client-server model of communication.
- [x] An organization's local DNS server (or default name server) helps other computers within the organization to resolve DNS queries.
- [x] An authoritative DNS server knows the answers to queries about names in the domain for which it is responsible ("kth.se", for example).

---

**Question 3: Which of the following statements about TCP congestion control are correct?**

- [ ] The congestion window always increases in size until there is a timeout at the sender. 
- [x] During the slow start phase, the congestion window increases exponentially in size. 
- [ ] Initially, the congestion window is 65535 bytes. 
- [ ] With fast retransmit and fast recovery retransmissions are made for each duplicate ACK.
- [x] During the congestion avoidance phase, the congestion window increases linearly in size.

---

**Question 4: Assume a reliable transport protocol of the same kind as described in the course book and the lectures (rdt 3.0 in the book), and that the protocol must work over a network where both bit errors and packet loss can occur. This protocol uses several mechanisms to detect and deal with the errors above, mainly timers, sequence numbers, checksums, and acknowledgements (ACKs).**

- [x] We can deal with packet loss through the use of sequence numbers, ACKs, and timers. Checksums are not needed.
- [ ] It is sufficient with checksums and ACKs to deal with bit errors (in data and ACKs). Neither sequence numbers nor timers are needed.
- [ ] We need checksums, ACKs, and timers to deal with bit errors (in data and ACKs). Sequence numbers are not needed.
- [ ] We can deal with packet loss using only sequence numbers and ACKs. Timers and checksums are not needed.
- [ ] We can deal with packet loss and duplicates using only ACKs and timers. Sequence numbers and checksums are not needed.
- [x] It is sufficient with checksums, ACKs, and sequence numbers to deal with bit errors (in data and ACKs). Timers are not needed.

---

**Question 5: TCP is connection oriented, which means that it has to deal with connection establishment and termination. Which of the following statements are true?**

- [x] When a TCP connection is being established, the very first segment sent is a TCP SYN segment.
- [x] When TCP closes a connection, it normally uses a 4-way handshake. 
- [ ] When a connections is closed in TCP, it has to be initiated by the same side that initiated the connection establishment.
- [ ] The initial sequence number selected by TCP is normally 0, but in some implementations it is 1.
- [ ] TCP's way of closing a connection makes it vulnerable to a denial-of service attack.

---

**Question 6: TCP and UDP are both transport layer protocols, but they operate very differently. Which of the following alternatives are correct?**

- [ ] The TCP checksum can be turned off through the API used (the socket API). 
- [x] UDP can protect data with a checksum, but does not always do that. 
- [x] A server supporting both TCP and UDP can use the same port number for communicating with one client over UDP and another client over TCP.
- [x] A UDP sender can "starve out" a TCP sender from the network. 
- [ ] A TCP-based server communicating with several clients in parallel is normally doing so over one single connection.

---

**Question 7: We have studied two different protocols for flow control: Go-Back-N and Stop-and-wait. Below is a list of properties. Choose the protocol(s) for which the property is valid.**

- Requires the sender to buffer multiple packets -> Go-Back-N
- Packet loss can require retransmission even of several correctly delivered packets -> Go-Back-N
- Use "cumulative ACKs" -> Go-Back-N
- Normally gives lowest utilization of available network capacity -> Stop-and-Wait
- Two sequence numbers are sufficient -> Stop-and-Wait

---

**Question 8: Assume we have a transport level connection with a capacity of 8 Mbit/s and that the delay between sender and receiver is 5 ms (one-way). Which is the optimal window size in bytes that the sender should use? Hint: calculate the bandwidth-delay product. Answer in number of bytes (not kB, not bits). Give only the value without units as your answer.**

Optimal window size = capacity x RTT = 8 Mbit/s x 10 ms = 10000 bytes

***NOTE: 8 * 125000 x 0.01 = 10000***

---

**Question 9: DNS can be seen as a distributed database. What kind of lookup operations (or translations) are supported by DNS?**

- [x] Name to name 
- [x] Name to authoritative DNS server 
- [x] Name to IPv4 address 
- [x] Name to mail server 
- [x] Name to IPv6 address

---

**Question 10: Web cookies, or HTTP cookies, are used by many web servers, for different purposes. Which of the following statements about web cookies are true?**

- [ ] By examining a cookie in my web browser, I can determine what information the web server has about me.
- [x] By using cookies, a web server can keep track of when a user last visited the site. 
- [x] Cookies are created by the web server and stored in the web client. 
- [ ] Cookies are small programs that are executed in the web browser. 
- [x] By using cookies, web servers can for instance keep track of user-specific information, such as shopping baskets.
- [ ] A web server can ask to see all cookies that the web browser has.

---

**Question 11: You have just started your computer and the first thing you do is to open a web browser to visit the site "www.kth.se". Which  application and transport layer protocols need to be involved in order to fetch the web page to your browser?**

- [ ] BitTorrent
- [x] UDP
- [ ] MIME
- [ ] POP
- [x] HTTP
- [x] TCP
- [ ] SMTP
- [ ] IMAP
- [x] DNS


<br>
<br>
<br>


# Lecture 1. Computer Networks and the Internet

## What is the internet?
- **Hosts** = endpoints that are connected to the Internet. The hosts are running network applications.
- **Communication Links** = The transmission rate is called *bandwidth*. There are two different types of links:
    - **Physical** = a link between two hosts that is physically connected to the Internet. (fiber, copper)
    - **Logical** = a link between two hosts that is connected to the Internet by means of a protocol. (radio, satellite)
- **Packet Switches** = Forwards packets (chunks of data) between hosts.
    - **Router** = Inspects data and chooses which link to use.
    - **Switch** = Forwards packets between multiple links.
- **Internet: "Network of networks"** = Interconnected ISPs (Internet Service Providers)
- **Internet Protocol** = The protocol that allows hosts to communicate with each other. Examples: TCP, UDP, ICMP, IP, HTTP etc.
- **Internet standard** = The set of protocols that are used to communicate with each other.
    - **RFC** = The Internet standard is called a *Request for Comments*.
    - **IETF** = The Internet standard is called an *Internet Engineering Task Force*.
- **Programming Interface** = The programming interface that allows a host to communicate with the Internet. For example via the socket API.

***"protocols define format and order of
messages sent and received among
network entities, and actions taken on
message transmission and reception"***

## Network edge
- **Network edge** = The edge of a network.
    - **Host** = A host is a device that is connected to the Internet.
    - **Server** = A server is a host that is connected to the Internet.

- **Packets** = Host sending information is breaking the information into packets with a length of **L** bits.
- **Links** = are serial connections between two hosts.
    - Packets transmitted one bit at a time at a certain rate **R**.
    - Links transmission rate, link capacity, or link bandwidth.

*Packet Transmission Delay = time needed to transmit a packet with L bits into link = **L (bits) / R (bits/sec)***

- **Propagation Delay** = The delay between the packet being sent and the packet being received.

![Transmission and Propagation Delay](/Lecture1.png)

## Internet Service Provider Access
Different ways of accessing the Internet:
- **xDSL (Digital Subscriber Line)**
    - ADSL, ADSL2, ADSL2+, VDSL, ...
    - Existing telephone lines
    - 1 - 100 Mbps
- **Optical Fiber**
    - 10 Mbps - 100 Gbps
- **DOCSIS (Data Over Cable Service Interface Specification)**
    - DOCSIS/Euro-DOCSIS (European DOCSIS)
    - Internet access over cable TV networks
    - 1 - 200Mbps
- **Wireless broadband**
    - 2.4 GHz - 5 GHz
    - Internet access over mobile phone networks
    - 1 Mbps - 1 Gbps

## The Network Core
- Mesh of interconnected routers
- **Packet Switching**
    - forward packets from one router to the next
    - each packet transmitted at full link capacity

- Packet Switching: store-and-forward
    - Store-and-forward: entire packet must arrive at a router before it can be transmitted on next link.
    - Processing delay: it takes some time for router to process packet before transmitting on next link
        - Check and verify packet
        - Decide what to do with it
        - Third delay component: TR

![Packet Switching](/Lecture1_2.png)

## Internet Protocol Stack
- **Application** = Supporting network applications.
    - FTP, SMTP, HTTP
- **Transport** = process-process data transfer.
    - TCP, UDP
- **Network** = Routing of datagrams from source to destination
    - IP, ARP, routing protocols
- **Link** = data transfer between neighboring network elements
    - Ethernet, wireless, optical fiber, etc.
- **Physical** = Bits "on the wire"


# Lecture 2. Application Layer

## Principles of Network Applications
Two different ways applications are used to communicate with each other:
- **Client-Server** = Client requests information from server. Server sends information back to client.

    **Server:**
    - always-on host
    - permanent IP address
    - data centers for scaling

    **Client:**
    - communicate with server
    - may be intermittently connected
    - may have dynamic IP addresses
    - do not communicate directly with each other

- **Peer-to-Peer** = Client and Client communicate with each other.
    - No always-on server
    - arbitrary end systems directly communicate
    - complex management

- **Messages**
    - **Type of message** - request, response, notification, error
    - **Message Syntax** - header, body
    - **Message Semantics** - meaning of information in field
    - **Message Rules** - rules for message syntax

Generate a table with the headers: Application, data loss, throughput, time sensitive

|Application|Data Loss|Throughput|Time Sensitive|
|---	|---	|---	|---	|
file transfer|no loss|elastic|no|
e-mail|no loss|elastic|no|
Web documents|no loss|elastic|no|
real-time audio/video|loss-tolerant|audio: 5kbps-1Mbps, video:10kbps-5Mbps|yes, 100’s msec|
stored audio/video|loss-tolerant|audio: 5kbps-1Mbps, video:10kbps-5Mbps|yes, few secs|
interactive games|loss-tolerant|few kbps up|yes, 100’s msec|
text messaging|no loss|elastic|yes and no|

#### **TCP Service**

- reliable transport between sending and receiving process
- flow control: sender won’t overwhelm receiver
- congestion control: throttle sender when network overloaded
- does not provide: timing, minimum throughput guarantee, security
- connection-oriented: setup required between client and server processes

#### **UDP Service**
- unreliable data transfer between sending and receiving process
- does not provide: reliability, flow control, congestion control, timing, throughput guarantee, security, connection setup

TCP is a connection-oriented protocol, whereas UDP is a connectionless protocol. A key difference between TCP and UDP is speed, as TCP is comparatively slower than UDP. Overall, UDP is a much faster, simpler, and efficient protocol, however, retransmission of lost data packets is only possible with TCP.

## Web and HTTP
![URL](/Lecture2.png)

- **HTTP is stateless**
Sses TCP, port 80:
- Stateless protocol
    - Client sends request
    - Server responds
- server maintains no
    - information about past client requests
- **protocols that maintain ”state” are complex!**
    - past history (state) must be maintained
    - if server/client crashes, their views of ”state” may be inconsistent, must be reconciled

## DNS
DNS (Domain Name System) is a critical component of the internet that allows us to use human-readable domain names (such as "google.com") instead of IP addresses (such as "172.217.167.110"). Here's an overview of how it works:

**I. Overview**:

- DNS is a hierarchical decentralized naming system for computers, services, or any resource connected to the Internet or a private network.
- It maps domain names to IP addresses, enabling browsers to load Internet resources.
- It operates in the background and is transparent to the user.


**II. The Structure of DNS**:

- The DNS namespace is organized as a tree structure, with the root at the top and subdomains branching off from it.
- The root domain is represented by a dot (.) and is managed by the Internet Assigned Numbers Authority (IANA).
- Top-level domains (TLDs), such as .com, .org, .gov, etc., are directly under the root domain.
- Second-level domains (SLDs), such as "google" in "google.com," are under the TLDs.
- The SLDs can further contain subdomains, such as "mail" in "mail.google.com."


**III. The Role of DNS Servers**:

- DNS servers act as a "telephone book" for the Internet, translating domain names into IP addresses.
- There are two main types of DNS servers: recursive resolvers (also known as DNS clients) and authoritative nameservers.
- Recursive resolvers initiate requests on behalf of clients (such as browsers) and send the requests to authoritative nameservers.
- Authoritative nameservers store information about a domain and respond to requests with the correct IP address.


**IV. The Process of Resolving a Domain Name**:
1. The client (such as a browser) sends a request to its recursive resolver for the IP address associated with a domain name.
2. The recursive resolver checks its cache to see if it has recently looked up the same domain name.
3. If the information is in its cache, the recursive resolver returns the IP address to the client.
4. If the information is not in the cache, the recursive resolver sends a request to the root nameserver.
5. The root nameserver responds with the IP address of a top-level domain (TLD) nameserver.
6. The recursive resolver sends a request to the TLD nameserver.
7. The TLD nameserver responds with the IP address of the authoritative nameserver for the domain name in question.
8. The recursive resolver sends a request to the authoritative nameserver.
9. The authoritative nameserver responds with the IP address associated with the domain name.
10. The recursive resolver returns the IP address to the client and stores it in its cache.


**V. Security Considerations**:

- DNS is a critical component of the Internet infrastructure and is vulnerable to a variety of security threats, such as DNS spoofing, cache poisoning, and man-in-the-middle attacks.
- To improve security, the DNS industry has developed several extensions and technologies, including DNSSEC, DNS-over-HTTPS (DoH), and DNS-over-TLS (DoT).
- In summary, the DNS is a distributed database that translates human-readable domain names into IP addresses and allows us to access websites and other - Internet resources using easy-to-remember names instead of complex IP addresses.

#### **Cookies**

what cookies can be used for:
- authorization
- shopping carts
- recommendations
- user session state (Web e-mail)

how to keep ”state”:
- protocol endpoints: maintain state at sender/receiver over multiple transactions
- cookies: http messages carry state



# Lecture 3. Transport Layer

## Transport services and protocols
- provide logical communication between app processes running on different hosts
- transport protocols run in end systems
    - send side: breaks app messages into segments, passes to network layer
    - rcv side: reassembles segments into messages, passes to app layer
- more than one transport protocol available to apps
    - Internet: TCP and UDP

## Transport vs. network layer
- **Network layer**: Logical communication between hosts
- **Transport layer**:Logical communication between processes
    - relies on, and enhances, network layer services

## Internet transport-layer protocols

**TCP**
- reliable, in-order delivery 
    - congestion control
    - flow control
    - connection setup
  
TCP (Transmission Control Protocol) is a reliable, connection-oriented, and widely used transport layer protocol in the Internet Protocol (IP) suite. It is responsible for reliable delivery of data between applications running on different hosts. Here are the key features and characteristics of TCP:

- Connection-Oriented: Unlike the unreliable and connectionless User Datagram Protocol (UDP), TCP establishes a reliable connection between two endpoints before transmitting data.

- Reliable Data Delivery: TCP ensures that all data sent from one end is received at the other end and in the correct order. It uses error detection and retransmission mechanisms to handle packet loss, corruption, and other errors during transmission.

- Flow Control: TCP uses sliding window flow control to regulate the amount of data sent and received by each endpoint. This mechanism helps prevent buffer overflow and network congestion.

- Congestion Control: TCP uses algorithms to adjust the sending rate based on network conditions to avoid congestion and minimize data loss.

- Segmentation: TCP divides data into segments, which are then transmitted and reassembled at the receiver.

- Sequence and Acknowledgment Numbers: TCP assigns a sequence number to each segment transmitted and uses acknowledgment numbers to confirm the reception of data by the other end.

- Retransmission: In case of packet loss or corruption, TCP retransmits the missing or damaged segments to ensure reliable data delivery.

- Window Size: TCP uses the concept of window size to regulate the flow of data. The sender and receiver negotiate a window size, which determines the maximum amount of data that can be transmitted before receiving an acknowledgment.

- Multiplexing and Demultiplexing: TCP allows multiple applications on the same host to share the same network connection by using port numbers to multiplex and demultiplex the data.

- Establishing and Terminating Connections: TCP uses a three-way handshake (SYN, SYN-ACK, and ACK) to establish a connection and a four-way handshake (FIN, FIN-ACK, ACK, and FIN-ACK) to terminate a connection.

**UDP**
- unreliable, unordered delivery: UDP
    - no-frills extension of “best-effort”IP
- services not available: 
    - delay guarantees
    - bandwidth guarantees
1. Connectionless: Unlike TCP, UDP does not establish a reliable connection between the sender and receiver. This makes it faster and more lightweight, as there is no overhead associated with establishing and maintaining a connection.
2. No Flow Control: UDP does not implement any flow control mechanisms, meaning that packets can be sent as fast as the sender can generate them. This can lead to problems if the receiver is unable to process the incoming packets as quickly as they are being sent.
3. No Error Correction: UDP does not provide any error correction mechanisms. This means that packets can be lost or delivered out of order, and there is no guarantee that a sent packet will actually reach its intended recipient.
4. Checksum: UDP includes a checksum in each packet to detect corruption of the data in transit. If the checksum fails, the packet is discarded by the receiver.
5. Multiplexing: UDP supports multiplexing, allowing multiple applications to share the same IP address and port number on the same host.
6. Simple and Efficient: Due to its lack of overhead, UDP is often used for real-time applications where low latency is important, such as video conferencing or online gaming.
7. Applications: UDP is used by a variety of applications, including DNS, SNMP, NTP, and TFTP.
