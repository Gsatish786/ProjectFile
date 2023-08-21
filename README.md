# ProjectFile

Brief explaination of project:

The program starts by creating a HashMap userSongs to store the songs of each user. Keys are usernames and values are Deques (a type of queue that allows adding or removing elements from both ends).

It defines a list of valid users, userlist, and a Scanner scn to read console inputs.

It then enters a loop that runs three times, each time asking for a valid username and updating that user's song list.

If a username is valid (i.e., it is in userlist), the program creates a Deque S1 to hold that user's songs and adds three songs to it. This Deque is then added to the userSongs HashMap.

The program enters another loop, running until S1 has more than three songs. If S1 has exactly three songs, it removes the first song.

It then asks for a song from the user. If the song is valid (i.e., it is in tlist, a list of valid songs) and isn't already in S1, it adds the song to S1 and prints the updated song list.

If the song is already in S1, the program asks for a different song.
