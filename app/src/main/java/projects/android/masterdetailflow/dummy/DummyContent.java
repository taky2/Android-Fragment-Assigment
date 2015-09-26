package projects.android.masterdetailflow.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static List<DummyItem> ITEMS = new ArrayList<>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, DummyItem> ITEM_MAP = new HashMap<>();

    static {
        // Add 3 sample items.
        addItem(new DummyItem( "1", "CS 1050 : Computer Science 1 *", "*Required \n\nStudents will learn a modern programming language and the basic skills needed to analyze problems and construct programs for their solutions. The emphasis of the course is on the techniques of algorithm development, correctness and programming style. "));
        addItem(new DummyItem( "2", "CS 1400 : Computer Organization 1 *", "*Required \n\nStudents will study the internal organization, characteristics, performance and interactions of a computer system's functional components. Topics include Binary codes and binary arithmetic, digital logic, central processor organization, instruction set architecture, input/output fundamentals, and memory architecture. "));
        addItem(new DummyItem( "3", "CS 2050 : Computer Science 2 *", "*Required \n\nThis course, a continuation of CS 1050, further emphasizes the concepts of the software development cycle and introduces the concept of an abstract data type (ADT). The topics covered include linked-lists, trees, stacks, queues, classes, recursion, and a variety of data representation methods."));
        addItem(new DummyItem( "4", "CS 2400 : Computer Organization 2 *", "*Required \n\nThe course presents the functional organization of computers, multicore and multithreaded processors, high-performance storage, multiprocessor and multicomputer parallel architectures, and error detecting/correcting codes. Students learn assembly language programming and create software using a contemporary development environment."));
        addItem(new DummyItem( "5", "CS 3140 : Human-Computer Interaction", "\n\nThis course explores and develops knowledge that enables computer scientists to improve human-computer interaction through the exploration of cognitive science theories with about how people interact with their environments. Topics include: how people interact with each other and with computers; insights provided by models of cognition, memory, perception, attention, and thought; defining, specifying and assessing usability; and the roles of computer interface elements and behaviors."));
        addItem(new DummyItem( "6", "CS 3210 : Principles of Programming Languages *", "*Required \n\nThis course traces the evolution of programming languages and identifies and analyzes the contributions made by several significant languages and their successors. Specific issues of programming language implementation such as creation of activation records for block-structured languages and static and dynamic scoping as methods for defining program object visibility are studied in depth. All four of the modern programming language paradigms (procedural, functional, object-oriented, and logical) will be studied."));
        addItem(new DummyItem( "7", "CS 3240 : Introduction to Theory of Computation *", "*Required \n\nThis course explores language theory and computability. Language theory includes: regular expressions, regular languages, and finite automata (deterministic and nondeterministic); context-free languages and pushdown automata; and language grammars. Computability includes: Tuning machines and their computing power; unsolvable problems; and intractable problems."));
        addItem(new DummyItem( "8", "CS 3280 : Object Oriented Development", "This is an upper-division software development class that focuses on the object-oriented programming paradigm. Object-oriented analysis, design, and development will be explored in some depth with emphasis on object definition, abstraction, polymorphism, encapsulation, and inheritance. Abstract class definitions are developed for a number of common objects and data structures, and derivative classes and subclasses are developed from these definitions. Students will develop a thorough understanding of an object-oriented programming language such as C++ or Smalltalk."));
        addItem(new DummyItem( "9", "CS 3510 : Computer Graphics", "\n\nThis course is a survey of graphics hardware and software. The topics covered include raster scan displays, windowing transformation, algorithms for vector generators, clipping, area fill, space transformations in two and three dimensions, perspective viewing methods, and graphical input."));
        addItem(new DummyItem("10", "CS 3600 : Operating Systems *", "*Required \n\nThis course provides an introduction to modern computer operating systems, their use, design, development, and implementation. Topics covered include: operating system modes, structuring methods, process and thread scheduling and dispatch, concurrency, inter-process communication, memory management, file system organization (in both stand-alone and networked environments), and system security. This course will require students to write programs that implement some operating system functions."));
        addItem(new DummyItem("11", "CS 3700 : Computer Networks", "\n\nThis course provides a comprehensive study of computer networks, from the physical aspects to the high-level application protocols with which most people interact. The software that provides the communication is emphasized. The methods for creating connections, making sure they are error free and in order, performing routing, and creating client/server interactions are discussed."));
        addItem(new DummyItem("12", "CS 3750 : Computer & Network Security", "\n\nThis course will cover how computers are compromised, what one needs to do to build security into every program, how cryptography assists in securing data, how operating systems affect computer security, how networks are secured, and the social and ethical aspects of computer security."));
        addItem(new DummyItem("13", "CS 3810 : Principles of Database Systems", "\n\nThis course covers the principles and methodologies of database design, and techniques for database application development. The topics covered include relational algebra, SQL queries, normalization, entity-relationship model, SQL/Host-language interface, stored procedure, object-oriented databases, and semi-structured databases."));
        addItem(new DummyItem("14", "CS 390F : Code Reading", "\n\nCode Reading introduces methods for reading, understanding, and debugging programs of medium to large size. The C and C++ programming languages and the Unix operating system are introduced, along with software management tools."));
        addItem(new DummyItem("15", "CS 390G : Parallel & Multi-Core Programming", "\n\nThis course will focus on writing programs that make use of multiple cores. We will investigate parallel programming concepts, and we will write programs using 3-5 different technologies that allow programmers to build programs to make use of multiple cores."));
        addItem(new DummyItem("16", "CS 390H : Mobile Device Programming", "\n\nDon't take it ;-P"));
        addItem(new DummyItem("17", "CS 390I : Intermediate Programming", "\n\nThis course provides the opportunity and support for students who wish to solidify and extend the computer programming knowledge and abilities acquired in Computer Science l & 2 (CS 1050 & CS 2050). Topics covered include tools, techniques, and approaches to help tackle the programming tasks of domain analysis, program design, coding, building, testing, and principled debugging."));
        addItem(new DummyItem("18", "CS 390J : Bio-Inspired Computing", "\n\nThis course will cover several different bio-inspired computing paradigms and their associated algorithms, including genetic programming, neural network programming, and swarm intelligence. Students will read, write, and experiment with programs in each area."));
        addItem(new DummyItem("19", "CS 390K : Programming Pragmatics", "\n\nThis upper-division course addresses pragmatic aspects of programming essential for generating correct programs in real-world environments. Emphasis is on those things that \"every programmer should know,\" including development principles (such as test-first development), best practices (such as source management and build configuration) and automated tools (such as static analyzers, debuggers, and test frameworks)."));
        addItem(new DummyItem("20", "CS 390N : Rigid Body Simulation", "\n\nThis course develops in detail a mathematical and algorithmic framework for a simple game engine, presenting a single focused approach to each of the problems involved in rigid body simulation. "));
        addItem(new DummyItem("20", "CS 4050 : Algorithms and Algorithm Analysis *", "*Required \n\nhe emphasis of this course is on the design, analysis, and evaluation of efficient algorithms for a wide variety of computing problems."));
        addItem(new DummyItem("21", "CS 425B : Web & Multimedia", " \n\nThe course presents the foundations of the latest in emerging web and multimedia technologies. For the Web area, it provides basic knowledge of Web concepts for information presentation using HTML and XML and to create client-server Web applications. Further the course addresses all the areas related to multimedia: text presentation in a multimedia stream, image and video processing, speech and audio processing."));
        addItem(new DummyItem("22", "CS 4250 : Software Engineering Principles *", "*Required \n\nThis course focuses on the software development life-cycle. Special emphasis is placed on the earlier phases in the life-cycle that precede the actual writing of the code, and the later phases in which the software is tested and evaluated after it is written. Finally, the post-implementation phases that represent the eighty- percent of the life cycle during which the software is evolving as it is in use are studied in depth."));
        addItem(new DummyItem("23", "CS 4260 : Software Engineering Practices *", "*Required \n\nThis course is a continuation of CS 4250, Software Engineering Principles. Students will work in teams of 4 to 6 and apply the principles to the development of a real-world project. Projects will be solicited from industry and progress will be evaluated in conjunction with industry representatives. (Senior Experience)"));


    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public String id;
        public String title;
        public String content;

        public DummyItem(String id, String title, String content) {
            this.id = id;
            this.title = title;
            this.content = content;
        }

        @Override
        public String toString() {
            return title;
        }
    }
}
