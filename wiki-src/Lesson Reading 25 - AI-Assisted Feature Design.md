# Lesson Reading 25 - AI-Assisted Feature Design

## Big Picture

AI can help students generate ideas, draft code, explain unfamiliar patterns, and compare design options. It can also create confusion if students treat confident output as proof that the code is good. This lesson is about using AI as a design assistant rather than as a substitute for understanding.

The most important rule is that generated code still has to be read, checked, and verified by humans. A program does not become trustworthy just because an AI wrote it smoothly. Students should therefore approach AI the same way they would approach code from any outside source: with curiosity, but also with responsibility.

This lesson fits late in the course on purpose. By now students have enough background to ask stronger questions about architecture, state ownership, hardware boundaries, commands, testing, and simulation. That means AI can be used more productively.

## Key Terms

- prompt: the instruction given to the AI
- constraint: a rule or design requirement the generated code should follow
- review: reading code carefully to check whether it makes sense and is likely to work
- verification: checking behavior through build, tests, simulation, or observation
- architecture: the larger organization of the code and its responsibilities
- hallucination: output that sounds plausible but is incorrect or unsupported

## Prompting for Better Design

An AI prompt is more useful when it asks for structure, not just output. Instead of saying only "make a robot feature," students should learn to specify the boundaries they want. Which subsystem should own the state? Should the code use providers? Should fake IO be supported? Should the command be testable? These questions push the output toward better architecture.

This matters because vague prompts often produce vague code. Better prompts do not guarantee perfect code, but they do improve the starting point. Prompting is therefore partly a technical skill and partly a thinking skill. It forces the student to say what good design should look like before the code appears.

## Review Before Trust

One dangerous habit is replacing understanding with trust. In plain language, that means believing code is good just because it sounds confident, looks organized, or compiles. Students should fight that habit directly. Compiling is good. Clear naming is good. But neither one guarantees the logic or architecture is correct.

Review means reading the generated code carefully and asking concrete questions. Which class is responsible for this information? Are hardware boundaries clear? Is a value a snapshot or a live provider? Does the command require the right subsystem? Is the state duplicated in more than one place? These are design questions, not just syntax questions.

The goal of review is not to catch the AI "cheating." The goal is to make sure the team actually understands the code they are about to rely on.

## Verification After Review

Even code that seems reasonable on inspection should be verified. That may mean building it, running tests, checking telemetry, or launching simulation. Verification answers the question, "Does the code behave the way we think it does?" Students should treat verification as required, not optional.

This is one of the clearest places where the whole course comes together. AI-assisted work still depends on reading skills, testing, simulation, and architecture judgment. In other words, AI changes the pace of writing, but it does not remove the need for engineering discipline.

## Why This Matters For FRC

FRC teams often work under time pressure. AI can help teams move faster, but speed without understanding is risky. Robots interact with hardware, safety boundaries, and changing match conditions. A team that accepts generated code without serious review may end up debugging more, not less.

Used well, however, AI can support strong students and newer students alike. It can generate alternatives, explain patterns, and accelerate drafting while the humans stay responsible for quality and correctness. That is the course's intended use.

## Before You Move On

- You should know that good prompts usually include design constraints, not just feature requests.
- You should understand that review means reading generated code carefully before trusting it.
- You should know that verification still matters even if the code looks good.
- You should understand that AI is a helper, not the authority on whether the code is correct.
