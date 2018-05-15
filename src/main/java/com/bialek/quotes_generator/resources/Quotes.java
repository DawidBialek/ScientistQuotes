package com.bialek.quotes_generator.resources;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Quotes {
    private List<String> quotes;

    public Quotes() {
        this.quotes = new ArrayList<>();

        quotes.add("\"Nature shows us only the tail of the lion. But there is no doubt in my mind that the lion belongs with it even if he cannot reveal himself to the eye all at once because of his huge dimension.\"\n~Albert Einstein");
        quotes.add("\"I am by heritage a Jew, by citizenship a Swiss, and by makeup a human being, and only a human being, without any special attachment to any state or national entity whatsoever.\"\n~Albert Einstein");
        quotes.add("\"As far as the laws of mathematics refer to reality, they are not certain; and as far as they are certain, they do not refer to reality.\"\n~Albert Einstein");
        quotes.add("\"As a human being, one has been endowed with just enough intelligence to be able to see clearly how utterly inadequate that intelligence is when confronted with what exists.\"\n~Albert Einstein");
        quotes.add("\"The most beautiful experience we can have is the mysterious. It is the fundamental emotion that stands at the cradle of true art and true science. Whoever does not know it and can no longer wonder, no longer marvel, is as good as dead, and his eyes are dimmed.\"\n~Albert Einstein");
        quotes.add("\"Imagination is more important than knowledge. Knowledge is limited. Imagination encircles the world.\"\n~Albert Einstein");
        quotes.add("\"Most teachers waste their time by asking questions that are intended to discover what a pupil does not know, whereas the true art of questioning is to discover what the pupil does know or is capable of knowing.\"\n~Albert Einstein");
        quotes.add("\"The important thing is to not stop questioning. Curiosity has its own reason for existing.\"\n~Albert Einstein");
        quotes.add("\"One thing I have learned in a long life: That all our science, measured against reality, is primitive and childlike — and yet it is the most precious thing we have.\"\n~Albert Einstein");
        quotes.add("\"My advice to other disabled people would be, concentrate on things your disability doesn't prevent you doing well, and don't regret the things it interferes with. Don't be disabled in spirit, as well as physically.\"\n~Stephen Hawking");
        quotes.add("\"I have noticed that even people who claim everything is predetermined and that we can do nothing to change it, look before they cross the road.\"\n~Stephen Hawking");
        quotes.add("\"If you jump into a black hole, your mass energy will be returned to our universe but in a mangled form which contains the information about what you were like but in a state where it can not be easily recognized. It is like burning an encyclopedia. Information is not lost, if one keeps the smoke and the ashes. But it is difficult to read.\"\n~Stephen Hawking");
        quotes.add("\"When we understand string theory, we will know how the universe began. It won't have much effect on how we live, but it is important to understand where we come from and what we can expect to find as we explore.\"\n~Stephen Hawking");
        quotes.add("\"It is no good getting furious if you get stuck. What I do is keep thinking about the problem but work on something else. Sometimes it is years before I see the way forward. In the case of information loss and black holes, it was 29 years.\"\n~Stephen Hawking");
        quotes.add("\"God may exist, but science can explain the universe without a need for a creator.\"\n~Stephen Hawking");
        quotes.add("\"The good thing about science is that it's true whether or not you believe in it.\"\n~Neil Degrasse Tyson");
        quotes.add("\"During our brief stay on planet Earth, we owe ourselves and our descendants the opportunity to explore — in part because it's fun to do. But there's a far nobler reason. The day our knowledge of the cosmos ceases to expand, we risk regressing to the childish view that the universe figuratively and literally revolves around us.\"\n~Neil Degrasse Tyson");
        quotes.add("\"As an educator, it's my duty to empower you to think. So that you can go forth and think accurate thoughts about how the world is put together.\"\n~Neil Degrasse Tyson");
        quotes.add("\"It's the inspired student that continues to learn on their own. That's what separates the real achievers in the world from those who pedal along, finishing assignments.\"\n~Neil Degrasse Tyson");
        quotes.add("\"Creativity is seeing what everyone else sees, but then thinking a new thought that has never been thought before and expressing it somehow.\"\n~Neil Degrasse Tyson");
    }

    public String getRandomQuote(){
        return quotes.get(ThreadLocalRandom.current().nextInt(1,quotes.size()));
    }
}
