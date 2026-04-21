# Lesson 23 Reading: Sensors, Units, and Data Flow

## Big Picture

Robots make decisions based on measurements. Those measurements come from sensors, but the raw numbers are only the beginning. Students also need to understand units and data flow. Units tell the program what a value means physically. Data flow describes how information moves from a sensor reading to a decision and then to an output or published value.

This lesson matters because many robot bugs are really measurement bugs. The sensor might be read incorrectly, converted incorrectly, interpreted incorrectly, or used in the wrong place. Students who understand the full path from measurement to action are much better prepared to diagnose these problems.

Units matter because a number without meaning is dangerous. A value of `2.0` could mean meters, rotations, seconds, volts, or something else entirely. Students should get used to asking not only "What is the number?" but also "What is the unit?"

## Key Terms

- sensor: a device or data source that measures part of the robot or environment
- raw reading: the direct measurement value before interpretation or conversion
- unit: the physical meaning attached to a value, such as meters or seconds
- calibration: adjusting interpretation so measurements line up with reality
- conversion: changing a value from one unit or representation to another
- data flow: the path information follows from source to use

## From Measurement to Meaning

A sensor reading is not automatically a useful decision. First the program reads the data. Then it often converts or calibrates that data. Then it decides what the value means for the robot's behavior. Students should think of sensor use as a pipeline, not as a one-step event.

For example, the robot may read a raw encoder value, convert it into a physical position, compare that position to a target, and then command a motor accordingly. If the final behavior is wrong, the problem could be anywhere along that pipeline. This is why understanding data flow matters so much.

Students should avoid treating sensor values as self-explanatory. Most measurements need context before they become useful.

## Why Units Matter

Units protect meaning. A number and a unit together form a much more honest statement than a number alone. If a value is in meters but another part of the code assumes rotations, the program may behave incorrectly even though the math itself looks valid. These are some of the most frustrating bugs because the numbers may appear reasonable while their meanings do not match.

This is why explicit unit thinking is so important in robotics. Distances, angles, velocities, accelerations, times, and voltages are all constantly in use. Students should build the habit of carrying unit meaning through the code and not letting it become implicit too early.

The broader lesson is that programming is not only symbolic. In robotics, it is tied directly to physical reality. Units are one of the main bridges between code and that reality.

## Data Flow and System Boundaries

Data flow means asking where information begins, which class reads it, which class transforms it, which class owns the interpreted result, and which code acts on it. A clean system usually has a readable answer to each of those questions.

This matters because tangled data flow makes debugging difficult. If a sensor value is read in one place, converted in a second, filtered in a third, and acted on in a fourth without clear boundaries, students may struggle to understand where a wrong result first appeared. Cleaner data flow makes investigation easier.

This also connects to subsystem ownership. A subsystem is often the natural home for managing the flow of its own measurements and decisions.

## Why This Matters For FRC

FRC robots depend on sensors for feedback, automation, safety checks, and telemetry. Students who understand units and data flow are better prepared to tune behavior, interpret dashboard information, and explain why the robot is making the decisions it is making.

This lesson also prepares students for simulation and more advanced control work. A robot cannot be reasoned about well if measurements, units, and decisions are all mixed together without clear flow.

## Before You Move On

- You should know that sensor readings usually need interpretation before they become useful decisions.
- You should understand why units are essential for honest robot code.
- You should know what calibration and conversion are in broad terms.
- You should be able to describe data flow as the path from measurement to action.
